package com.example.webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    //JSP
    //src\main\resources\META-INF\resources
    //login?name=parametro
    //Model
    @RequestMapping(value="login", method = RequestMethod.GET)
    public String gotoLoginPage(){

        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String gotoWelcomePage(@RequestParam String name, 
        @RequestParam String password, ModelMap map){

        if(authenticationService.authenticate(name, password)){

            map.put("name", name);
            return "welcome";
        }

        map.put("errorMessage", "Credenciales invalidas");
        return "login";
    }
}
