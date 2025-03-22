package com.example.webapp.politicos;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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

    @RequestMapping(value = "add-politico", method = RequestMethod.GET)
    public String mostrarNuevoPolitoPagina(ModelMap model) {
        String nombre = (String) model.get("nombre");
        String apellido = (String) model.get("apellido");
        String apodo = (String) model.get("apodo");

        Politico politico = new Politico(0, nombre, apellido, apodo, 0);
        model.put("politico", politico);
        return "politico";
    }
    
    @RequestMapping(value = "add-politico", method = RequestMethod.POST)
    public String nuevoPolitico(ModelMap model, Politico politico) {

        politicoService.addPolitico(politico.getNombre(), politico.getApellido(),
            politico.getApodo(), politico.getEdad());
        return "redirect:list-politicos";
    }

}
