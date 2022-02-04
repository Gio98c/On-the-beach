package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import it.unical.ingsw.onthebeach.model.Lido;
import it.unical.ingsw.onthebeach.model.Ombrellone;
import it.unical.ingsw.onthebeach.model.Recensione;
import it.unical.ingsw.onthebeach.model.Utente;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.*  ;
import java.util.List;


@Controller
public class Product {

    @RequestMapping(value="/imgPath")
    public void fotoLido(HttpServletResponse resp, HttpServletRequest req) throws SQLException, IOException {

        String nomeLido = req.getParameter("lido");

        Lido lido = Database.getInstance().getLidoDao().findByPrimaryKey(nomeLido);

        byte[] immagineLido = Database.getInstance().getLidoDao().trovaImmagine(lido.getNome());
        resp.setContentType("image/jpeg");
        resp.setContentLength(immagineLido.length);
        resp.getOutputStream().write(immagineLido);
    }

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


    @RequestMapping("/imgPath1/{param1}")
    public void profilo(HttpServletRequest req, HttpServletResponse res) throws SQLException, IOException, ServletException, IOException {

        String username = (String) req.getSession().getAttribute("username");

        byte[]img= Database.getInstance().getLidoDao().trovaImmagine(username);
        res.setContentType("image/jpeg");
        res.setContentLength(img.length); // imageBytes - image in bytes
        res.getOutputStream().write(img);
        res.getOutputStream().flush();
        res.getOutputStream().close();

    }


}


