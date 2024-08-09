package models;

public class SistemaSIRF {
    private String numProcesso;
    private String statusProcesso;

    public SistemaSIRF(String numProcesso, String statusProcesso){
        this.numProcesso = numProcesso;
        this.statusProcesso = statusProcesso;
    }

    public String getNumProcesso(){
        return numProcesso;
    }

    public String getStatusProcesso(){
        return statusProcesso;
    }
}
