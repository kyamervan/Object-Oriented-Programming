package Enum2;

public class Main {
    public static void main(String[] args) {

        KahveBoyutu k1 = KahveBoyutu.LARGE;
        System.out.println(k1.name());
        System.out.println(k1.ordinal());
        System.out.println(k1.getHacim());
        System.out.println(k1.getEkstraUcret());

        for (KahveBoyutu k : KahveBoyutu.values()) {
            System.out.println(k);
        }

    }
}
