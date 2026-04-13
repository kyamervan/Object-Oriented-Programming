package Magaza;

public class Main {
    public static void main(String[] args) {

        Magaza m1 = new Magaza();
        System.out.println("sipariş kod: " + m1.siparisKod);
        System.out.println("sipariş kod: " + Magaza.siparisKod);
        System.out.println("Magaza kod: " + m1.magazaKod);
        System.out.println("Magaza kod: " + m1.magazaKod);
        System.out.println("İndirim: " + Magaza.indirim);

        m1.metot(2);
    }
}
