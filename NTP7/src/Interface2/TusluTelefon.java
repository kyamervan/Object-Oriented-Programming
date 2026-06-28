package Interface2;

public class TusluTelefon extends Telefon{

    public TusluTelefon(String marka , String model) {
        super(marka , model);
    }
    @Override
    public void aramaYap(String numara) {
        System.out.println(numara + " numara");
    }

    @Override
    public void mesajGonder(String mesaj) {
        System.out.println(mesaj + " mesaj gönderiliyor");
    }

    void yilanOyunuOyna() {
        System.out.println("yılan oyunu");
    }
}
