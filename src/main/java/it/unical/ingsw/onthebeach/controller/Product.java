package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.sql.*  ;
import java.util.List;


@Controller
public class Product {

    @GetMapping("/product")
    public String paginaProdotti(HttpServletRequest req) throws SQLException {
        /*if (req.getSession().getAttribute("username") != null) {
            //System.out.println(req.getSession().getAttribute("nome"));
            Lido lido = Database.getInstance().getLidoDao().findByPrimaryKey((String) req.getSession().getAttribute("nome"));
            req.setAttribute("lido", lido);

            return "products";
        }*/

        String nomeLido = req.getParameter("lido");
        System.out.println(nomeLido);
        Lido lido = Database.getInstance().getLidoDao().findByPrimaryKey(nomeLido);
        req.setAttribute("lido", lido);
        //System.out.println(lido.getNome());
        List<Recensione> recensioni = Database.getInstance().getRecensioneDao().findByLido(nomeLido);
        req.setAttribute("recensioni", recensioni);
        for(Recensione r : recensioni){
            System.out.println(r.getTesto());
        }

        List<Ombrellone> ombrelloni = Database.getInstance().getOmbrelloneDao().findByLido(nomeLido);
        req.setAttribute("ombrelloni", ombrelloni);
        for(Ombrellone o : ombrelloni){
            System.out.println(o.getIdOmbrellone());
        }


        return "products";
        //return "nonAutorizzato";
    }


}


