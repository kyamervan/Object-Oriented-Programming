package Enumerations;

public class Main {
    public static void main(String[] args) {

        AlanKodu aln1 = AlanKodu.ISPARTA;
        System.out.println(aln1.name());
        System.out.println(aln1.getKisaltma());
        System.out.println(aln1.getKod());
        System.out.println(aln1.ordinal());

        for (AlanKodu a: AlanKodu.values()) {
            System.out.println(a);
        }
    }
}
