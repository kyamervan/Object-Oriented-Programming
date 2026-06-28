package Interface;

public class DisiKedi extends Kedi {

    @Override
    public String sesCikar(String ses) {
        return "kısık miyav" + ses;
    }

    @Override
    public void yasa() {
        System.out.println("evde yasa");
    }

    @Override
    public void kulak() {
        System.out.println("xx frekans");
    }
}
