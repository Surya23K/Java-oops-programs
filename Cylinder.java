package shapes;
import java.util.Scanner;
public class Cylinder implements Volume_cal
{
    int r,h;
    public void volume()
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Input radius");
    r=sc.nextInt();
    System.out.println("Input height");
    h=sc.nextInt();
    System.out.println("Volume of cylinder:"+(3.14*r*r*h));
}
}
