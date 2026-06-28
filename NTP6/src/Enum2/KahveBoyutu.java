package Enum2;

public enum KahveBoyutu {

    SMALL("S" , 0 , 250) , MEDIUM("M" , 15 , 350) ,
    LARGE("L" , 30 , 450);

    public String kisaltma;
    public int ekstraUcret;
    public int hacim;

    private KahveBoyutu(String kisaltma , int ekstraUcret , int hacim) {
        this.kisaltma = kisaltma;
        this.ekstraUcret = ekstraUcret;
        this.hacim = hacim;
    }

    public String getKisaltma() {return kisaltma;}
    public int getEkstraUcret() {return ekstraUcret;}
    public int getHacim() {return hacim;}

}
