package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Prenotazione;
import it.unical.ingsw.onthebeach.persistenza.dao.jdbc.PrenotazioneDaoJDBC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.theme.SessionThemeResolver;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.Temporal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Properties;

@RestController
public class PrenotazioneREST {



    //vedere che ombrelloni che cos'è: int o String?
    @PostMapping("/prenota")
    public String creaPrenotazione(HttpServletRequest req, HttpServletResponse resp, @RequestParam Prenotazione prenotazioneCreata) throws SQLException, IOException, ParseException {
        //System.out.println("sono in preRest" + prenotazioneCreata.getNomeLido());
        //System.out.println(numOmbrelloni);
        /*Date dataAttuale = (Date) Calendar.getInstance().getTime();

        Date datee = Date.valueOf(LocalDate.now());

        String nomeLido1 = req.getParameter("lido");

        List<Ombrellone> ombrelloniList = new ArrayList<>();
        for(int o : ombrelloni)
            ombrelloniList.add(Database.getInstance().getOmbrelloneDao().findByPrimaryKey(o));

        java.util.Date dataInizio1 = new SimpleDateFormat("dd/MM/yyyy").parse(dataInizio);
        java.util.Date dataInizio2 = new SimpleDateFormat("dd/MM/yyyy").parse(dataFine);

        float prezzoTotale = 0;
        for(Ombrellone o : ombrelloniList) {
            prezzoTotale += o.getPrezzo();
        }

        long intervalloGiorni = Duration.between((Temporal) dataInizio1, (Temporal) dataInizio2).toDays();
        if(intervalloGiorni != 0)
            prezzoTotale *= intervalloGiorni;


        Prenotazione prenotazione = new Prenotazione(prezzoTotale, null, dataAttuale, (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataInizio), (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataFine), (String) req.getSession().getAttribute("username"), nomeLido1);
        */

        prenotazioneCreata.setUsernameCliente((String) req.getSession().getAttribute("username"));
        System.out.println(prenotazioneCreata.getDataInizio());
        if(Database.getInstance().getPrenotazioneDao().save(prenotazioneCreata)) {

            /*for(Ombrellone o : ombrelloniList) {
                Database.getInstance().getOmbrelloneDao().switchOccupato(o);
            }*/

            resp.sendRedirect("checkout");
            return "prenotazioneCreata";
        } else {
            return "error";
        }
    }

    @PostMapping("/pagamentoInSede")
    public String pagamentoInSedeInvioEmail(HttpServletRequest req, HttpServletResponse resp) throws SQLException, IOException {
        String to = Database.getInstance().getUtenteDao().findByPrimaryKey((String) req.getSession().getAttribute("username")).getEmail();
        String from = "giovannigallo385@gmail.com";
        String host = "localhost";

        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);

        Session session = Session.getDefaultInstance(properties);

        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Pagamento in sede");
            message.setText("Il tuo pagamento in sede è stato accettato!");

            Transport.send(message);
            System.out.println("email inviata");

            resp.sendRedirect("index");
            return "emailInviata";
        } catch (MessagingException e) {
            e.printStackTrace();
        }

        return "error";
    }
}
