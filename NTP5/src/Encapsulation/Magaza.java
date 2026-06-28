package Encapsulation;

public class Magaza {

    int a = 3;
    public int b = 4;
    private int c = 5;
    protected int d = 6;

    private void privateMetot() {
        System.out.println("Private metot");
    }

    public void defaultMetot() {
        System.out.println(" " + c);
        privateMetot();
    }

    protected void protectedMetot() {
        System.out.println(" " + d);
        privateMetot();
    }
}
