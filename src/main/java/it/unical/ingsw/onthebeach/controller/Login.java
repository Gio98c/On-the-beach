package it.unical.ingsw.onthebeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Login {
    @GetMapping("/login")
    public String paginaLogin() {
        return "loginPage";
    }
}
