package OgrenciDers;

public class Ders {

    int dersId;
    String dersAd;
    Ogrenci ogrenci;

    public String yazDers() {

        String metin = dersId + " Numaralı " + dersAd + " isimli dersi ";

        if (ogrenci != null) {

            metin += ogrenci.ogrenciAd + " isimli öğrenci almaktadır";
        }
        else {
            metin += "Dersi Alan Öğrenci yok";
        }
        return metin;
    }

}
