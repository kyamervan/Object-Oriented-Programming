package GetSet;

public class Ogrenci {

    private String ad;
    private int boy;

    public Ogrenci(){
    }

    public Ogrenci(String ad , int   boy) {
        this.ad = ad;
        this.boy = boy;
        System.out.println("Ogrencinin adı ve boyu: " + ad + " " + boy);
    }

    public String getAd() {
        return ad;
    }
    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getBoy() {
        return boy;
    }
    public void setBoy(int boy) {
        this.boy = boy;
    }
}