package services;

import java.util.HashMap;
import java.util.Map;

import models.SistemaNF;
// import models.SistemaSIRF;


public class NFService {

    private Map<String, String> guias;

    public NFService() {
        guias = new HashMap<>();
        guias.put("54321", "Paga");
        guias.put("98765", "Pendência");
    }

    public SistemaNF consultarGuia(String numGuia){

        String status = guias.getOrDefault(numGuia, "Número da guia não encontrado");
        return new SistemaNF(numGuia, status);
    }
}
