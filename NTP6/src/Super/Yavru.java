package Super;

public class Yavru extends Ana {
public String i="A";
public Yavru()
{
    super("Türetilen");
    System.out.println("Yavru yapılandırıcı");
}
public void yaz()
{
    System.out.println(super.i);
    System.out.println(i);
    super.yaz();
    System.out.println("Yavru sınıf");
}
}