package models;

public class SistemaNF {
    private String numGuia;
    private String statusGuia;

    public SistemaNF(String numGuia, String statusGuia){
        this.numGuia = numGuia;
        this.statusGuia = statusGuia;
    }

    public String getNumGuia(){
        return numGuia;
    }

    public String getStatusGuia(){
        return statusGuia;
    }

    
}
