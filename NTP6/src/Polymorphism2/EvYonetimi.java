package Polymorphism2;

public class EvYonetimi {

    public String cihazKontrolEt(Cihaz c) {

        if (c instanceof Televizyon t) {
            return t.kanalDegistir();
        }
        else if (c instanceof Utu u) {
            return u.kumasSec();
        }
        return c.calis();
    }
}
