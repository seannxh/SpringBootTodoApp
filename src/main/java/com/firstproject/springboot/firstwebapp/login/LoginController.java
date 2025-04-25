package com.firstproject.springboot.firstwebapp.login;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @RequestMapping("/login")
    @ResponseBody
    public String login(@RequestParam(required=false) String name, ModelMap model) {
        model.put("name", name);
        return "Welcome to Login Page!" + name;
    }

    @RequestMapping("/")
    public String login1() {
        return "Welcome to Login Page!";
    }



}
