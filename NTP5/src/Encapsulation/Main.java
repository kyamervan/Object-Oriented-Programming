package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Magaza m1 = new Magaza();
        System.out.println("default: " + m1.d);
        m1.defaultMetot();
        m1.protectedMetot();
    }
}
