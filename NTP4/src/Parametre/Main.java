package Parametre;
public class Main {
    static void topla(int... sayilar) {
        int toplam = 0;
        for(int s: sayilar) {
            toplam += s;
        }System.out.println("Toplanan sayılar: " + toplam);
    }
    static void topla(int a) {
        int toplam = 5;
        System.out.println(toplam);
    }
    public static void main(String[] args) {

        topla(3 );
    }
}