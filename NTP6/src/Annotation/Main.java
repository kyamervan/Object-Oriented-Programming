package Annotation;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        System.out.println(h1.ses());

        Hayvan h2 = new Kedi();
        System.out.println(h2.ses());

        Hayvan h3 = new Kopek();
        System.out.println(h3.ses());

        Kopek h4 = new Kopek();
        System.out.println(h4.ses());

        //Kopek h5 = new Hayvan();
        //System.out.println(h5.ses());
    }
}
