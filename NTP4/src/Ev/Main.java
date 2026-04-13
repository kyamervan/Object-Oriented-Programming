package Ev;

public class Main {
    public static void main(String[] args) {
        Ev ev1 = new Ev();
        ev1.yazdir();

        Ev ev2 = new Ev("Mela Mıstefa Caddesi");
        ev2.yazdir();

        Ev ev3 = new Ev(45);
        ev3.yazdir();

        Ev ev4 = new Ev("mssm" + 5848);
        ev4.yazdir();
    }
}
