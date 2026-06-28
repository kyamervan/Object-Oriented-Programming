package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Hayvan h1=new Hayvan();
        System.out.println(h1.ses()) ;
        //System.out.println(h1.besle()) ;
        Hayvan h2=new Kedi();
        System.out.println(h2.ses());
        //System.out.println(h2.besle());
        Hayvan h3=new Kopek();
        System.out.println(h3.ses());
        Kopek h4=new Kopek() ;
        System.out. println(h4.ses());
        System.out.println(h4.besle());
        Besle b1=new Besle();
        System.out.println(b1.beslen(h2)) ;
        System.out.println(b1.beslen(h3)) ;
        //Kopek h5=new Hayvan() ;
        //System.out.println(h1.ses())

        Hayvan h5 = new Kedi();

        if (h5 instanceof Kedi k) {
            System.out.println(k.ses());
        }
        else if (h5 instanceof Kopek ko) {
            System.out.println(ko.ses());
        }

    }
}
