package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Recensione;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@RestController
public class RecensioneREST {

        @PostMapping("/updateRecensione")
        public String modificaRecensione(HttpServletRequest req, HttpServletResponse resp, String testo, String usernameCliente, Long idPrenotazione, Long idRecensione) throws SQLException, IOException {

                try {
                        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
                                "postgres", "root");

                        Statement st = conn.createStatement();

                        if (Database.getInstance().getRecensioneDao().updateText(new Recensione (testo,usernameCliente,idPrenotazione,idRecensione))) {

                                resp.sendRedirect("index");
                                return "modifica Recensione completata";
                        } else
                                return "ERRORE";
                } catch (SQLException | IOException e) {
                        e.printStackTrace();
                        resp.sendRedirect("profile");
                        return "error";
                }
        }
}

