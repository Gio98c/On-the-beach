package it.unical.ingsw.onthebeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Shop{
    @GetMapping("/pageShop")
    public String paginaShop() {
        return "pageShop";
    }
}

