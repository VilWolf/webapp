package com.example.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public boolean authenticate(String user, String password){

        boolean isValidUserName = user.equalsIgnoreCase("wolf");
        boolean isValidPassword = password.equalsIgnoreCase("password");
        return isValidUserName && isValidPassword;

    }
}
