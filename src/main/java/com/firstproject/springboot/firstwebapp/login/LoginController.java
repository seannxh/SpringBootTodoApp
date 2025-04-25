package com.firstproject.springboot.firstwebapp.login;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    private AuthenticateUser authenticateUser;
    private Logger logger = LoggerFactory.getLogger(getClass());

    public LoginController(AuthenticateUser authenticateUser) {
        this.authenticateUser = authenticateUser;
    }

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login() {

        return "Welcome to Login Page!";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String WelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
        if (authenticateUser.authentiate(name, password)) {
            model.put("name", name);
            model.put("password", password);
            return "Welcome to Login Page!";
        }
        return "LOGIN AGAIN";
    }
    @RequestMapping("/")
    public String login1 () {
        return "Welcome to Home Page!";
    }
}