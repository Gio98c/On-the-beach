package it.unical.ingsw.onthebeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class product {
    @GetMapping("/products")
    public String paginaProdotti() {
        return "products";
    }
}
