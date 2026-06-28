package Abstarct;

public class Main {
    public static void main(String[] args) {
        Besle bakici = new Besle();

        // 🛑 DIKKAT: Aşağıdaki satırlar derleme hatası verirdi (Abstract oldukları için):
        // Hayvan h = new Hayvan();
        // Kedi k = new Kedi();
        // Kopek kp = new Kopek();

        // ✅ Ama Upcasting sayesinde soyut referanslara somut nesne atayabiliriz:
        Hayvan dKedi = new DisiKedi();

        // Şimdi Besle sınıfındaki metoda bu nesneyi gönderelim:
        System.out.println(bakici.beslen(dKedi));


    }
}
