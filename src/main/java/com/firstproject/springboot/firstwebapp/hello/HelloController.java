package com.firstproject.springboot.firstwebapp.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello! What will you be learning today?";
    }
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHTML(){
        return "Hello! What will you be learning today?";
    }

}
