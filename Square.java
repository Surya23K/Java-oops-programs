public class Square {
    int s;
    void getData(int side)
    {
        s=side;
    }
    int calArea()
{
    return s*s;
}
public static void main(String[]args)
{
    Square s1=new Square();
    s1.getData(4);
    System.out.println("Area of square:"+s1.calArea());
}
}
