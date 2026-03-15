package Araba;

public class Main {
    public static void main(String[] args) {

        Araba.Binek.Sedan araba1 = new Araba.Binek.Sedan();
        System.out.println("Sedan motor hacmi: " + araba1.motorHacmi);

        Araba.Ticari.Agir araba2 = new Araba.Ticari.Agir();
        System.out.println("Ağır Ticari Vergi: " + araba2.vergi);
    }
}