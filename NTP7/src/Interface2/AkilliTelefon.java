package Interface2;

public class AkilliTelefon extends Telefon {

    public AkilliTelefon (String marka ,String model) {
        super(marka, model);
    }

    @Override
    public void aramaYap(String numara) {
        System.out.println(numara + " numara");
    }

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println(mesaj + " mesaj gönderiliyor");
    }

    void interneteBaglan() {
        System.out.println("Bağlandı");
    }



}
