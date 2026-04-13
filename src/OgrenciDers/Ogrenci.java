package OgrenciDers;

public class Ogrenci {

    int ogrenciNo;
    String ogrenciAd;
    Ders ders;

    public String yazOgrenci() {

        String metin = ogrenciNo + " Numaralı " + ogrenciAd + " isimli oğrenci ";

        if (ders != null) {
            metin += ders.dersAd + " dersi almaktadır";
        }

        else {
            metin += "Ders almamaktadır";
        }
        return metin;
    }

}
