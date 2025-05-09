import java.util.Scanner;
public class CheckNumberException
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int a=sc.nextInt();
        try{
            if(a>0)
            {
                System.out.println("Positive number:");
            }
            else{
                throw new NumberException("invalid number");
            }
        }
    catch(NumberException e){
        System.out.println(e.getMessage());
    }
    }
}