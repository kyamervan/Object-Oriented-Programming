package BaslatmaBloklari;

public class BaslatmaBloklari {

    int i;
    {
        i=5;
        System.out.println(i);
    }
    static int m;
    static {
        m=0;
        System.out.println(m);
    }
    public static void main(String[] args) {
        new BaslatmaBloklari();
        new BaslatmaBloklari();
    }

}

