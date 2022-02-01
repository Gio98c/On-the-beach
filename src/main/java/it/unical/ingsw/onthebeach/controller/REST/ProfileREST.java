package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@RestController
public class ProfileREST {

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

            return "Update Completato";
        } catch (SQLException e) {
            resp.setStatus(500);
            e.printStackTrace();
        }

        return null;
    }

    @PostMapping("/updateInfoLido")
    public String modificaInfoLido(HttpServletRequest req, HttpServletResponse resp, String telefono, String email, String descrizione, int numOmbrelloni, String foto) throws SQLException {

        Lido lido = Database.getInstance().getLidoDao().findByGestore((String) req.getSession().getAttribute("username"));
        String sql = "UPDATE lido "
                + "SET numero = ?, email = ?, descrizione = ?, foto = ?, numero_ombrelloni = ? where nome = ?;";

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
                    "postgres", "root");

            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, telefono);
            ps.setString(2, email);
            ps.setString(3, descrizione);
            ps.setString(4, foto);
            ps.setInt(5, numOmbrelloni);
            ps.setString(6, lido.getNome());

            ps.executeUpdate();

            return "Update Completato";
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

    @PostMapping("/promozione")
    public String promozioneUtente(HttpServletRequest req, HttpServletResponse resp) throws SQLException {
        System.out.println(req.getAttribute("usrCliente"));
        if(Database.getInstance().getUtenteDao().setAdmin((String) req.getAttribute("usrCliente")))
            return "utentePromosso";

        return "errore";
    }
}

