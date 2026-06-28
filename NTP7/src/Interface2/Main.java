package Interface2;

public class Main {
    public static void main(String[] args) {

        IletisimCihazı akilli = new AkilliTelefon("İphone" , "17");
        IletisimCihazı tuslu= new TusluTelefon("Nokia" , "a7");

        akilli.aramaYap("8787");
        tuslu.aramaYap("54544");

        if(akilli instanceof AkilliTelefon a1) {
            a1.interneteBaglan();
        }

        if(tuslu instanceof TusluTelefon t1) {
            t1.yilanOyunuOyna();
        }

    }
}
