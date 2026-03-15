package Araba2;

public class Main {
    public static void main(String[] args) {

        Araba a1 = new Araba();
        a1.yaz1();
        Araba.Binek b1 = a1.new Binek();
        b1.yaz2();
        Araba.Binek.Sedan s1 = b1.new Sedan();
        s1.yaz3();
    }
}
