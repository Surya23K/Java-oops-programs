import java.util.Scanner;
public class Fac{
    String name;
    int age;
    void getdata()
    {
        Scanner scan=new  Scanner(System.in);
        System.out.println("\n\n Enter faculty name:");
        name=scan.nextLine();
        System.out.println("\n\n Faculty age:");
        age=scan.nextInt();
    }
    void display()
    {
        System.out.println("Faculy Name:"+name);
        System.out.println("Faculty age:"+age);
    }
    public static void main(String[] args) 
        {
            Fac f1=new Fac();
            f1.getdata();
            System.out.println("Faculty details");
            System.out.println("\n\n\n\n\n\n");
            f1.display();
        }
    }

