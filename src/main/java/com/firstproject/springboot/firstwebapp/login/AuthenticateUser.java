package com.firstproject.springboot.firstwebapp.login;


import org.springframework.stereotype.Service;

//Business Logic Needs Service
@Service
public class AuthenticateUser {

    public boolean authentiate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("dummy");
        boolean isValidPassword = password.equalsIgnoreCase("dummy");

        return isValidPassword && isValidPassword;


    }
}
