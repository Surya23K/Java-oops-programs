import shapes.Cube;
import shapes.Cuboid;
import shapes.Cylinder;
import java.util.Scanner;
public class VolumeDemo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        Cube obj1=new Cube();
        Cuboid obj2=new Cuboid();
        Cylinder obj3=new Cylinder();
        while(true)
        {
            System.out.println("\n1.Cube \n2.Cuboid \n3.Cylinder");
            System.out.println("Enter your choice(1-3)");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1:
                    obj1.volume();
                    break;
                case 2:
                    obj2.volume();
                    break;
                case 3:
                    obj3.volume();
                    break;     
                case 4:
                    System.out.println("Exiting!!");
                    System.exit(0);
                default:
                    break;       

            }
        }
    }
}