import java.util.Arrays;
import java.util.Scanner;;
public class SortString {
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    String strElement;
    System.out.println("Enter no of strings");
    int n=s.nextInt();
    s.nextLine();
    String[]str=new String[n];
    System.out.println("Enter the string");
    for(int i=0;i<n;i++)
    {
        str[i]=s.nextLine();
    }
    Arrays.sort(str);
    System.out.println("\n Sorted string:");
    for(String word:str)
    {
        System.out.println(word);
    }
    s.close();
}  
}
