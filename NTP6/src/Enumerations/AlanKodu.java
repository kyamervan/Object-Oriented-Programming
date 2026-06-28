package Enumerations;

public enum AlanKodu {

    ISPARTA("ISP" ,246) , ANKARA("ANKR" , 312) ,
    ANTALYA("ANT" , 242);

    public String kisaltma;
    public int kod;
    private AlanKodu(String kisaltma , int kod) {
        this.kisaltma = kisaltma;
        this.kod = kod;
    }

    public String getKisaltma() {
        return kisaltma;
    }
    public int getKod() {
        return kod;
    }
}


