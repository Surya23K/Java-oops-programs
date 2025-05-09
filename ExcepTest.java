import java.io.*;
public class ExcepTest
{
    static int a[]={44,55};
    public static void main(String[] args) {
        try{
            System.out.println("Access element three:"+a[3]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Exception thrown"+e);
        }
        finally
    {
        System.out.println("Access element two:"+a[2]);
    }
    }
}