package Abstract2;

public class Dokunmatik extends Telefon {

    public String konus() {
        return "dokunmatik konusuyor";
    }

    @Override
    public void arama() {
        System.out.println("aranıyor dokunarak");
    }
}
