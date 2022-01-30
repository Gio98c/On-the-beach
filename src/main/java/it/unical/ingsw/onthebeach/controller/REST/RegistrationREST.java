package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@RestController
public class RegistrationREST {

    @PostMapping("/registrationServices")
    public String registrati(HttpServletRequest req, HttpServletResponse resp, String nome, String email, String username, String passw) throws ServletException, IOException {

        //sql aggiunta di un utente nel database

        String sql = "insert into utente (username, nome, email, password, tipo_utente) values ('"+ username +"','"+ nome +"','"+ email +"','"+ passw +"','"+ 0 +"');";

        try {
            Connection conn = DriverManager.getConnection("\"jdbc:postgresql://localhost:5432/postgres\", \"postgres\", \"root\"");

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            if(rs.next()) {
                resp.sendRedirect("login");
                return "registrazioneEffettuata";
            }
            else
                return "error";
        } catch (SQLException | IOException e) {
            e.printStackTrace();
            resp.sendRedirect("login");
            return "error";
        }
    }

    @PostMapping("/registrationServicesGoogle")
    public String registratiGoogle(HttpServletResponse resp, String username, String email, String nome) throws SQLException, IOException {

        Utente utente = new Utente(username, nome, null, email, null, "Cliente", null);
        if(Database.getInstance().getUtenteDao().save(utente)) {
            resp.sendRedirect("profile");
            return "registrazioneCompletata";
        }

        return "error";
    }
}
