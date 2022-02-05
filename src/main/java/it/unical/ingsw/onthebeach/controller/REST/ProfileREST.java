package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@RestController
public class ProfileREST {

    @PostMapping("/updateInfoUtente")
    public String modificaInfoUtente(HttpServletRequest req, HttpServletResponse resp, String nome, String cognome, String email) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
                    "postgres", "root");

            Utente utente = Database.getInstance().getUtenteDao().findByPrimaryKey((String) req.getSession().getAttribute("username"));

            if(nome!=null || !nome.isEmpty() ){
                utente.setNome(nome);
            }
            if(cognome!=null || !cognome.isEmpty()){
                utente.setCognome(cognome);
            }
            if(email!=null || !email.isEmpty()){
                utente.setEmail(email);
            }

            if (Database.getInstance().getUtenteDao().update(utente)) {
                return "Update Completato";
            } else {
                return "Error";}

        } catch (SQLException e) {
            resp.setStatus(500);
            e.printStackTrace();
        }

        return null;
    }

    @PostMapping("/updateInfoLido")
    public String modificaInfoLido(HttpServletRequest req, HttpServletResponse resp, String telefono, String email, String descrizione, Integer numOmbrelloni, @RequestParam("foto") MultipartFile file) throws SQLException {


        try {


            Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/GestoreLido2",
                    "postgres", "root");

            Lido lido = Database.getInstance().getLidoDao().findByGestore((String) req.getSession().getAttribute("username"));


            Statement st = conn.createStatement();

            if(telefono!=null || !telefono.isEmpty()){
                lido.setNumero(telefono);
            }
            if(email!=null || !email.isEmpty()){
                lido.setEmail(email);
            }
            if(descrizione!=null || !descrizione.isEmpty()){
                lido.setDescrizione(descrizione);
            }
            if(!(numOmbrelloni ==null)){
                lido.setNumeroOmbrelloni(numOmbrelloni);
            }
            if(!(file ==null)){
                lido.setFoto(file.getBytes());
            }


            if (Database.getInstance().getLidoDao().saveOrUpdate(lido)) {
                return "Update Completato";
            } else {
                return "Error";}

        } catch (SQLException | IOException e) {
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
    public String promozioneUtente(String username) throws SQLException {
        System.out.println(username);
        if(Database.getInstance().getUtenteDao().setAdmin(username))
            return "utentePromosso";

        return "errore";
    }
}

