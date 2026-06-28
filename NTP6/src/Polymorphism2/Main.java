package Polymorphism2;

public class Main {
    public static void main(String[] args){

        EvYonetimi ev1 = new EvYonetimi();
        Cihaz c1 = new Televizyon();
        Cihaz c2 = new Utu();

        System.out.println(ev1.cihazKontrolEt(c1));
        System.out.println(ev1.cihazKontrolEt(c2));

    }
}
