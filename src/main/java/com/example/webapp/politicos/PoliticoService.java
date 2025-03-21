package com.example.webapp.politicos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class PoliticoService {

    private static List<Politico> politicos = new ArrayList<>();
    static {
        politicos.add(new Politico(1, "Andres", "Manuel", "AMLO", 67));
        politicos.add(new Politico(2, "Jose", "Antonio", "Meade", 50));
        politicos.add(new Politico(3, "Ricardo", "Anaya", "Ricky Riquin Canallin", 39));
    }

    public List<Politico> findByName(String nombre){
        return politicos;
    }
}
