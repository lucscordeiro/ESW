import services.*;
import models.*;

public class Chatbot {
    private SIRFService sirfService;
    private NFService nfService;

    public Chatbot() {
        this.sirfService = new SIRFService();
        this.nfService = new NFService();
    }

    public void iniciarAtendimento(String numProcesso, String numGuia){
        System.out.println("Bem-vindo ao nosso serviço de atendimento!");

        // Consultar o status do processo
        SistemaSIRF processo = sirfService.consultarProcesso(numProcesso);
        System.out.println("Processo: " + processo.getNumProcesso() + ", Status: " + processo.getStatusProcesso());

        // Consultar o status da guia
        SistemaNF guia = nfService.consultarGuia(numGuia);
        System.out.println("Guia: " + guia.getNumGuia() + ", Status: " + guia.getStatusGuia());
    }

}
