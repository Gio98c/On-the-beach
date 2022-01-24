package it.unical.ingsw.onthebeach.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class HomePage {
    @GetMapping("/index")
    public String homePage(HttpServletRequest req, HttpServletResponse resp) {
        return "index";
    }
}
