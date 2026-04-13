package Ogrenci;

public class Ogrenci {

    String ad;
    int boy;

    public Ogrenci(String ad , int boy) {
        this.ad = ad;
        this.boy = boy;
        System.out.println("Ogrenci'nin adı ve boyu: " + ad + " " + boy);
    }
    public Ogrenci(int boy) {
        this("Melike" , boy);
        /*his.ad = "Ali";
        this.boy = boy;
        System.out.println("Ogrenci'nin adı ve boyu: " + ad + " " + boy);*/
    }
    public Ogrenci(String ad) {
        this(ad ,147);
       /* this.ad = ad;
        this.boy = 180;
        System.out.println("Ogrenci'nin adı ve boyu: " + ad + " " + boy);*/
    }
    public Ogrenci() {

        this("Mervan" , 343);
        this.boy= 48848;
        System.out.println("Ogrenci'nin adı ve boyu: " + ad + " " + boy);

/*        this.ad = "Mela";
        this.boy = 190;
        System.out.println("Ogrenci'nin adı ve boyu: " + ad + " " + boy);*/
    }
}
