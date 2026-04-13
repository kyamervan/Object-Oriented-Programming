package Ev;

public class Ev {
    String sokakAdi;
    int kapiNo;

    public Ev() {
        this.sokakAdi = "Yok";
        this.kapiNo = 0;

    }
    public Ev(String sokakAdi) {
        this.sokakAdi = sokakAdi;
        this.kapiNo = 77;
    }
    public Ev(int kapiNo) {
        this.sokakAdi = "Çelebi";
        this.kapiNo = kapiNo;
    }
    public Ev(String sokakAdi , int kapiNo) {
        this.sokakAdi = sokakAdi;
        this.kapiNo = kapiNo;
    }

    public void yazdir() {
        System.out.println(sokakAdi + " " + kapiNo);
    }
}
