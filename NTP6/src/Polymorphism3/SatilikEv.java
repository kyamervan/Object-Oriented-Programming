package Polymorphism3;

public class SatilikEv extends Ev{

    public SatilikEv(int metreKare) {
        super(metreKare);
    }

    @Override
    public int getFiyat() {
        return metreKare*5000;
    }

}
