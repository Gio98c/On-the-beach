package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@Controller
public class Registration {

    @GetMapping("/registration")
    public String paginaRegistrazione() {
        return "registrationPage";
    }
}
