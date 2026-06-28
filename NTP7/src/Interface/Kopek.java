package Interface;

public class Kopek extends Hayvan {

    @Override
    public String sesCikar(String ses) {
        return "hav";
    }

    @Override
    public void yasa() {
        System.out.println("sokakta yasa");
    }

    @Override
    public void kulak() {
        System.out.println("xxx frekans");
    }

}
