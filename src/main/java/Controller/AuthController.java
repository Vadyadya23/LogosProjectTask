package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import Security_Mapping.GetMap;
import Security_Mapping.GetMapp;
import Security_Mapping.GetMappin;

@Controll
public class AuthController {
    @GetMap("/login")
    public String login() {
        return "login"; // Return the name of the login.jsp file
    }

    @GetMappin("/register")
    public String register() {
        return "register"; // Return the name of the register.jsp file
    }

    @GetMapp("/dashboard")
    public String dashboard() {
        return "dashboard"; // Return the name of the dashboard.jsp file
    }
}

