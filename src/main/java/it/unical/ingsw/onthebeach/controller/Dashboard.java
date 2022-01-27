package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

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
}
