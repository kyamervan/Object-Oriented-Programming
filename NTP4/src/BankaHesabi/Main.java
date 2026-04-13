package BankaHesabi;

public class Main {
    public static void main(String[] args) {

        BankaHesabi b1 = new BankaHesabi();
        BankaHesabi b2 = new BankaHesabi("Mahmut");
        b2.paraYatir(4654);
        BankaHesabi b3 = new BankaHesabi("Veli" , 50151);
        BankaHesabi.bankaBilgisiGoster();
    }
}
