import java.util.Scanner;

import javax.security.auth.login.CredentialException;
public class Authentication {
    public static void main(String[] args) {
        String username="Surya";
        String password="@surya123";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter username");
        String u1=sc.nextLine();
        System.out.println("Enter password");
        String u2=sc.nextLine();
        try{
            if((u1.equals(username))&&(u2.equals(password)))
            {
                System.out.println("Access Granted");
            }
            else{
                throw new CredentialException("Invalid Credentials");
            }
        }
        catch(CredentialException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
