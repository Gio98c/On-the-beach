package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


@Controller
public class Shop{
    @GetMapping("/pageShop")
    public String paginaShop(HttpServletRequest req) throws SQLException {

        List<Lido> allLidi = Database.getInstance().getLidoDao().findAll();
        req.setAttribute("lidi", allLidi);

        List<Ombrellone> allOmbrelloni = Database.getInstance().getOmbrelloneDao().findAll();
        req.setAttribute("ombrelloni", allOmbrelloni.get(0));

        return "pageShop";
    }

    @GetMapping("/pageShopSearch")
    public String ricerca(HttpServletRequest req) throws SQLException {
        String nomeLido = req.getParameter("lido");

        Lido lido = Database.getInstance().getLidoDao().findByPrimaryKey(nomeLido);
        req.setAttribute("lidi", lido);

        List<Ombrellone> ombrellone = Database.getInstance().getOmbrelloneDao().findByLido(nomeLido);
        List<Ombrellone> tmp = new ArrayList<>();
        tmp.add(ombrellone.get(0));
        req.setAttribute("ombrelloni", tmp);

        return "pageShop";
    }
}

