package com.example.webapp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    //'say-hello' => 'Hello que vas a aprender hoy?'

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hello que vas a aprender hoy?";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml(){
        StringBuffer sb = new StringBuffer();

        sb.append("<html>");
        sb.append("<head>");
        sb.append("<title> Mi primera pagina html </title>");
        sb.append("</head>");
        sb.append("<body>");
        sb.append("Mi primer body de pagina html");
        sb.append("</body>");
        sb.append("</html>");

        return sb.toString();
    }

    //JSP
    //src\main\resources\META-INF\resources
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp(){
        return "sayHello";
    }

}
