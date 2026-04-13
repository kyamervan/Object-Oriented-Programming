package Ogrenci;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.ogrenciAd = "Mervan";
        ogr1.ogrenciNo = 232;

        Ders d1 = new Ders();
        d1.dersAd = "Veri Tabanı";
        d1.dersId = 4921;

        Bolum b1 = new Bolum();
        b1.bolumAd = "Yazılım Mühendisliği";

        ogr1.oBolum = b1;

        b1.bOgrneciler = new Ogrenci[100];
        b1.bOgrneciler[0] = ogr1;

        ogr1.oDersler = new Ders[7];
        ogr1.oDersler[0] = d1;

        d1.dBolum = b1;

        b1.bDersler = new Ders[10];
        b1.bDersler[0] = d1;

        d1.dOgrenciler = new Ogrenci[100];
        d1.dOgrenciler[0] = ogr1;

        System.out.println(ogr1.ogrenciAd + " nın aldığı ders " + ogr1.oDersler[0].dersAd);
        System.out.println("Bölümü ilk dersi " + ogr1.oDersler[0].dersAd);

    }
}
