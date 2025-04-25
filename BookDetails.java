import java.util.Scanner;
class Publisher
{
    String pubName;
    Publisher(String pub)
    {
        pubName=pub;
    }
}
class Book extends Publisher
{
    String book;
    Book(String pub,String bk)
    {
        super(pub);
        book=bk;
    }
}
class Literature extends Book{
    String category;
    Literature(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+pubName);
        System.out.println("Book:"+book);
        System.out.println("category:"+category);
    }
}
class Fiction extends Book
{
    String category;
    Fiction(String pub,String bk,String ctgry)
    {
        super(pub,bk);
        category=ctgry;
    }
    void display()
    {
        System.out.println("Publisher:"+pubName);
        System.out.println("Book:"+book);
        System.out.println("Category:"+category);
    }
}
public class BookDetails
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter literature book details");
        System.out.println("Book name");
        String b=s.nextLine();
        System.out.println("Publisher");
        String pub=s.nextLine();
        System.out.println("Category");
        String c=s.nextLine();
        Literature ob1=new Literature(b,pub,c);
        System.out.println("Enter Fiction Book Details");
        System.out.println("Book name");
        String b1=s.nextLine();
        System.out.println("Publisher");
        String p1=s.next();
        System.out.println("Category");
        String c1=s.next();
        Fiction ob2=new Fiction(b1,p1,c1);
        System.out.println("Literature book");
        System.out.println("________________");
        ob1.display();
        System.out.println("\n Fiction book**");
        System.out.println("_____________________");
        ob2.display();
        s.close();
    }
}