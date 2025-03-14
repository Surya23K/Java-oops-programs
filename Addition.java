import java.util.Scanner;
public class Addition
 {
    void sum(int a)
    {
        System.out.println("Sum of one number with sum is"+(a+a));
    }
    void sum(int a1,int b1)
    {
        System.out.println("\n Sum of two numbers is"+(a1+b1));
    }
    void sum(double x,double y)
    {
        System.out.println("\n Sum of two floating numbers"+(x+y));
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter number");
        int a=s.nextInt();
        System.out.println("\n Enter two numbers");
        int a1=s.nextInt();
        int b1=s.nextInt();
        System.out.println("\n Enter two floating point numbers");
        Double x=s.nextDouble();
        Double y=s.nextDouble();
        Addition ob=new Addition();
        ob.sum(a);
        ob.sum(a1,b1);
        ob.sum(x,y);
    }
}
