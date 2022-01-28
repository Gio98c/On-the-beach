package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.*;
import java.util.List;

@Controller
public class Dashboard {

    @GetMapping("/profile")
    public String paginaProfilo(HttpServletRequest req) throws SQLException {
        if(req.getSession().getAttribute("username") != null) {
            //System.out.println(req.getSession().getAttribute("username"));
            Utente utente = Database.getInstance().getUtenteDao().findByPrimaryKey((String) req.getSession().getAttribute("username"));
            req.setAttribute("utente", utente);

            //chiedere A kReale
            Lido lido = Database.getInstance().getLidoDao().findByGestore((String) req.getSession().getAttribute("username"));
            req.setAttribute("lido", lido);

            List<Utente> utentiCliente = Database.getInstance().getUtenteDao().findAllFromTipoUtente("Cliente");
            req.setAttribute("utenteCliente", utentiCliente);

            return "dashboard";
        }

        return "Non Autorizzato";
    }
/*
    @GetMapping("/logout")
    public void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect("login");
    }
*/

    @PostMapping("/updateInfoUtente")
    public String modificaInfoUtente(HttpServletRequest req, HttpServletResponse resp, String nome, String cognome, String email) {

        String sql = "UPDATE utente "
                + "set nome = ?, cognome = ?, email = ? "
                + "WHERE username = ?;";

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
                    "postgres", "root");

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, nome);
            ps.setString(2, cognome);
            ps.setString(3, email);
            ps.setString(4, (String) req.getSession().getAttribute("username"));

            ps.executeUpdate();
        } catch (SQLException e) {
            resp.setStatus(500);
            e.printStackTrace();
        }

        return null;
    }

    @PostMapping("/cambiaPassword")
    public String cambiaPassword(HttpServletRequest req, HttpServletResponse resp, String password, String newpassword) throws SQLException {

        Utente utente = Database.getInstance().getUtenteDao().findByPrimaryKey((String) req.getSession().getAttribute("username"));

        if(!utente.getPassword().equals(password)) {
            return "passwordErrata";
        } else if(Database.getInstance().getUtenteDao().setPassword((String) req.getSession().getAttribute("username"),newpassword)){
            return null;
        }
        else return "modificheErrate";

        /*Database

            String sql = "UPDATE utente SET password = ? WHERE username = ?;";

            try {
                Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                        "postgres", "postgres");

                PreparedStatement ps = conn.prepareStatement(sql);

                ps.setString(1, newpassword);

            } catch (SQLException e) {
                e.printStackTrace();
            }*/
        //Database.getInstance().getUtenteDao().setPassword((String) req.getSession().getAttribute("username"), newpassword);
    }

}
