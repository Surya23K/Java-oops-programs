package shapes;
import java.util.Scanner;
public class Cuboid implements Volume_cal {
    int l,b,h;
    public void volume()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input length");
        l=sc.nextInt();
        System.out.println("Input breadth");
        b=sc.nextInt();
        System.out.println("Input height");
        h=sc.nextInt();
        System.out.println("Volume of cuboid:"+(l*b*h));
    }
}
