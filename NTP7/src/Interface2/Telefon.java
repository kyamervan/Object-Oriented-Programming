package Interface2;

public abstract class Telefon implements IletisimCihazı {


    String marka;
    String model;

    public Telefon(String marka , String model) {
        this.marka = marka;
        this.model = model;
    }

    public void bilgileriGoster() {
        System.out.println(marka + model);
    }

}
