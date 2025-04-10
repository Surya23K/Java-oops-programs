 package graphics;
import java.util.Scanner;
public class Triangle implements Area_cal {
    int h,b;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input breadth");
        b=sc.nextInt();
        System.out.println("Input height");
        h=sc.nextInt();
        System.out.println("Area of Triangle:"+(0.5*h*b));
    }
}
