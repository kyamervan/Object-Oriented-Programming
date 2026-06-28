package Immutable;

public final class Ogrenci {
    private final String ad;
    private final int boy;

    public Ogrenci(String ad , int boy) {
        this.ad = ad;
        this.boy = boy;
        System.out.println("Öğrencinin adı ve boyu: " + ad+ " " + boy);
    }

    public String getAd() {
        return ad;
    }
    public int getBoy() {
        return boy;
    }
}
