import java.util.Scanner;
public class Shapes
 {
    void area(int r1)
    {
        System.out.println("Area of circle with Radius"+r1+"="+3.14*r1*r1);
    }
    void area(int l1,int b1)
    {
        System.out.println("\n Area of rectangle is with dimensions"+l1+"X"+b1+"="+l1*b1);
    }
    void area(int l2,int b2,int h2)
    {
        System.out.println("\n Area of cuboid is with dimension"+l2+"X"+b2+"X"+h2+"="+l2*b2*h2);
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("\n Enter length");
        int l=s.nextInt();
        System.out.println("\n Enter breadth");
        int b=s.nextInt();
        System.out.println("\n Enter height");
        int h=s.nextInt();
        System.err.println("\n Enter Radius");
        int r=s.nextInt();
        Shapes ob=new Shapes();
        ob.area(r);
        ob.area(l,b);
        ob.area(l,b,h);
    }
}
