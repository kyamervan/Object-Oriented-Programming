package Magaza;

public class Magaza {
    static int siparisKod;
    String magazaKod;
    static boolean indirim;

    static int yeniDeger = siparisKod +1;

    void metot(int siparisKod) {
        Magaza.siparisKod = siparisKod;
        Magaza mm1 = new Magaza();
        mm1.magazaKod = "Isparta";
        metot2();

        System.out.println(siparisKod + " " + mm1.magazaKod);

    }
    static void metot2() {
        Magaza mm1 = new Magaza();
        mm1.metot(123);
    }
}
