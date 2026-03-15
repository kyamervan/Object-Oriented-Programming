package Ev;

public class Main {
    public static void main(String[] args) {

        Ev ev1 = new Ev();
        ev1.yaz();

        Ev yazlikEv = new Ev();
        yazlikEv.sokakAdi = "İstasyon Sokak";
        yazlikEv.kapiNo = 39;
        yazlikEv.yaz();

        Ev kislikEv = new Ev();
        kislikEv.sokakAdi = "Nur Sokak";
        kislikEv.kapiNo = 31;
        kislikEv.yaz();

        System.out.println("--------------------------");
        Ev tmp = new Ev();
        tmp = kislikEv;
        kislikEv = yazlikEv;
        yazlikEv = tmp;

        yazlikEv.yaz();
        kislikEv.yaz();

        System.out.println("-------------------------------");

        Ev tmp2 = new Ev();
        tmp2 = kislikEv;
        kislikEv.kapiNo = 332;
        tmp2.yaz();
    }
}
