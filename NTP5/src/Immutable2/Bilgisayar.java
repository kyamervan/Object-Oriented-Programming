package Immutable2;

public final class Bilgisayar {

    private final String model;
    private final int ramKapasitesi;

    public Bilgisayar(String model , int ramKapasitesi) {
        this.model = model;
        this.ramKapasitesi = ramKapasitesi;
    }

    public String getModel() {
        return model;
    }
    public int getRamKapasitesi() {
        return ramKapasitesi;
    }
}
