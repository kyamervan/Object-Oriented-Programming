package BankaHesabi;

public class BankaHesabi {
    String hesapSahibi;
    int bakiye;
    static int toplamHesapSayisi = 0;

    public BankaHesabi(String hesapSahibi , int bakiye) {
        this.hesapSahibi = hesapSahibi;
        this.bakiye = bakiye;
        BankaHesabi.toplamHesapSayisi++;
    }
    public BankaHesabi(String hesapSahibi) {
        this(hesapSahibi , 45);
    }
    public BankaHesabi() {
        this("Muzaffer" , 78);
    }

    void paraYatir(int miktar) {
        this.bakiye += miktar;
        System.out.println(this.hesapSahibi  + "Adlı hesaba" +bakiye);
    }
    public static void bankaBilgisiGoster() {

        System.out.println("bankamızdaki toplam hesap sayisi: " + BankaHesabi.toplamHesapSayisi);
    }
}
