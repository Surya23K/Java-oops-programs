
import java.util.Scanner;
public class StringManip {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        System.out.println("Length of string="+str1.length());
        System.out.println("Character at 2nd position="+str1.charAt(1));
        System.out.println("String contains 'ple' sequence:"+str1.contains("ple"));
        System.out.println("String ends with e:"+str1.endsWith("e"));
        System.out.println("Replace 'pp' with 'nk':"+str1.replaceAll("pp","nk"));
        System.out.println("Lower case:"+str1.toLowerCase());
        System.out.println("Upper case:"+str1.toUpperCase());
        System.out.println("Index of 'e':"+str1.indexOf('e'));
        System.out.println("Substring from index2:"+str1.substring(2));
        System.out.println("Enter 2nd string");
        String str2=sc.nextLine();
        System.out.println("String 1 concatenated with string 2:"+str1.concat(str2));
    }
}
