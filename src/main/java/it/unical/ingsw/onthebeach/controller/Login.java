package it.unical.ingsw.onthebeach.controller;

import it.unical.ingsw.onthebeach.Database;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

@Controller
public class Login {
    @GetMapping("/login")
    public String paginaLogin() {
        return "loginPage";
    }

    @GetMapping("/logout")
    public void logout(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        HttpSession session = req.getSession();
        session.invalidate();
        resp.sendRedirect("login");
    }

    @PostMapping("/loginServices")
    public String faiLogin(HttpServletRequest req, HttpServletResponse resp, String username, String passw) throws IOException {

        String sql = "SELECT * FROM utente WHERE username = '"+ username +"'";
        HttpSession session = req.getSession(true);



        try {
            Connection conn = (Connection) Database.getInstance();

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()) {
                session.setAttribute("username", rs.getString("username"));
                resp.sendRedirect("dashboard");
            } else {
                return "login";
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
