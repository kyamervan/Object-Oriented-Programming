package Polymorphism3;

public class KiralikEv extends Ev{

    public KiralikEv(int metreKatre) {
        super(metreKatre);
    }

    @Override
    public int getFiyat() {
        return metreKare * 50;
    }
}
