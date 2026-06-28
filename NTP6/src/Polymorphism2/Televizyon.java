package Polymorphism2;

public class Televizyon extends Cihaz{

    @Override
    public String calis() {
        return  "Televizyon çalışıyor";
    }

    public String kanalDegistir() {
        return "Kanal değiştirildi";
    }
}
