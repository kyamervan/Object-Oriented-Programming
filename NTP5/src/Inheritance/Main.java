package Inheritance;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        AtArabasi araba1 = new AtArabasi();
        System.out.println(araba1.tekerlek());

        SporAraba araba2  = new SporAraba();
        System.out.println(araba2.kapi());
        System.out.println(araba2.tekerlek());

        BinekAraba araba3 = new BinekAraba();
        System.out.println(araba3.kapi());
        System.out.println(araba3.tekerlek());
    }
}
