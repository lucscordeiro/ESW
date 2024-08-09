package services;

import models.*;
import java.util.HashMap;
import java.util.Map;

public class SIRFService {

    private Map<String, String> processos;

    public SIRFService() {
        processos = new HashMap<>();
        processos.put("12345", "Em análise");
        processos.put("67890", "Concluído");
    }

    public SistemaSIRF consultarProcesso(String numProcesso){
        String status = processos.getOrDefault(numProcesso, "Número do processo não encontrado");
        return new SistemaSIRF(numProcesso, status);
    }
}
