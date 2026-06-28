package GetSet;

public class Main {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci();
        ogr1.setAd("Serhat");

        System.out.println(ogr1.getAd());

        Ogrenci ogr2 = new Ogrenci("Ali" , 54);
        System.out.println(ogr2.getAd());

    }
}
