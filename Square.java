package graphics;
import java.util.Scanner;
public class Square implements Area_cal {
    int s;
    public void area()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Input side");
        s=sc.nextInt();
        System.out.println("Area of Square:"+(s*s));
    }
}