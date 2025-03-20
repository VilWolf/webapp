package com.example.webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //JSP
    //src\main\resources\META-INF\resources
    //login?name=parametro
    //Model
    @RequestMapping("login")
    public String gotoLoginPage(@RequestParam String name, @RequestParam String apellido, ModelMap model){

        model.put("name", name);
        model.put("apellido", apellido);

        System.out.println("parametro name: " + name);
        return "login";
    }

}
