package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@Controller
public class Dashboard {

    @GetMapping("/profile")
    public String paginaProfilo(HttpServletRequest req) {
        if(req.getSession().getAttribute("username") != null) {

            Utente utente = Database.getInstance().getUtenteDao().findByPrimaryKey((String) req.getSession().getAttribute("username"));

            req.setAttribute("utente", utente);

            return "dashboard";
        }

        return "Non Autorizzato";
    }

    @PostMapping("/updateInfoUtente")
    public String modificaInfoUtente(HttpServletRequest req, HttpServletResponse resp, String nome, String cognome, String email) {

        String sql = "UPDATE utente "
                + "set nome = ?, cognome = ?, email = ? "
                + "WHERE username = ?;";

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres",
                    "postgres", "postgres");

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
}
