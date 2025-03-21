package com.example.webapp.politicos;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class PoliticoController {

    private PoliticoService politicoService;

    public PoliticoController(PoliticoService politicoService) {
        this.politicoService = politicoService;
    }

    @RequestMapping("list-politicos")
    public String listaTodosPoliticos(ModelMap map) {

        List <Politico> politicos = politicoService.findByName("Andres");
        map.addAttribute("politicos", politicos);

        return "listaPolitico";
    }
    

}
