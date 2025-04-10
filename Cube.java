package shapes;
import java.util.Scanner;
public class Cube implements Volume_cal {
    Double a;
    public void volume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side");
        a=sc.nextDouble();
        System.out.println("Volume of cube:"+(a*a*a));
    }
}
