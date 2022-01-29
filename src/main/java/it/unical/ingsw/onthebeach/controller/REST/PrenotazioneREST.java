package it.unical.ingsw.onthebeach.controller.REST;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Prenotazione;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@RestController
public class PrenotazioneREST {

    //vedere che ombrelloni che cos'è: int o String?
    @PostMapping("/prenota")
    public String creaPrenotazione(HttpServletRequest req, HttpServletResponse resp, String nomeLido, int[] ombrelloni, String dataInizio, String dataFine) throws SQLException, IOException, ParseException {
        //System.out.println(numOmbrelloni);
        Date dataAttuale = (Date) Calendar.getInstance().getTime();

        List<Ombrellone> ombrelloniList = new ArrayList<>();
        for(int o : ombrelloni)
            ombrelloniList.add(Database.getInstance().getOmbrelloneDao().findByPrimaryKey(o));

        float prezzoTotale = 0;
        for(Ombrellone o : ombrelloniList)
            prezzoTotale += o.getPrezzo();


        Prenotazione prenotazione = new Prenotazione(prezzoTotale, null, dataAttuale, (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataInizio), (Date) new SimpleDateFormat("dd/MM/yyyy").parse(dataFine), (String) req.getSession().getAttribute("username"), nomeLido);
        if(Database.getInstance().getPrenotazioneDao().save(prenotazione)) {

            for(Ombrellone o : ombrelloniList) {
                Database.getInstance().getOmbrelloneDao().switchOccupato(o);
            }

            resp.sendRedirect("checkout");
            return "prenotazioneCreata";
        } else {
            return "error";
        }
    }
}
