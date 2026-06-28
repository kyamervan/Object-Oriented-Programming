package Polymorphism3;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Genel g1 = new Genel();

        Ev ev1 = new KiralikEv(100);
        Ev ev2 = new SatilikEv(130);

        System.out.println(g1.hesap(ev1));
        System.out.println(g1.hesap(ev2));
    }
}
