package com.example.webapp.politicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PoliticoService {

    private static int counPoliticos = 0;

    private static List<Politico> politicos = new ArrayList<>();
    static {
        politicos.add(new Politico(++counPoliticos, "Andres", "Manuel", "AMLO", 67));
        politicos.add(new Politico(++counPoliticos, "Jose", "Antonio", "Meade", 50));
        politicos.add(new Politico(++counPoliticos, "Ricardo", "Anaya", "Ricky Riquin Canallin", 39));
    }

    public List<Politico> findByName(String nombre){
        return politicos;
    }

    public void addPolitico(String nombre, String apellido, String apodo, int edad) {
        
        Politico politico = new Politico(++counPoliticos, nombre, apellido, apodo, edad);
        politicos.add(politico);

    }
}
