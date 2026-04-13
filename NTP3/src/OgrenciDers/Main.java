package OgrenciDers;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.ogrenciAd = "Mervan";
        ogr1.ogrenciNo = 105;

        Ders ders1 = new Ders();
        ders1.dersAd = "Nesne Tabanlı programlama";
        ders1.dersId = 200;

        ogr1.ders = ders1;
        System.out.println(ogr1.yazOgrenci());

        ders1.ogrenci = ogr1;
        System.out.println(ders1.yazDers());



    }
}
