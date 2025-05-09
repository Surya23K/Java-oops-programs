import java.util.Scanner;
interface Calc
{
    void calculate();
}
class Bill implements Calc{
    String  pid,pname;
    int quality;
    double price,total,amount=0;
    Scanner sc=new Scanner(System.in);
    public void getdata()
    {
        System.out.println("Enter product details");
        System.out.println("______________________");
        System.out.println("Product Id:");
        pid=sc.nextLine();
        System.out.println("Product names:");
        pname=sc.nextLine();
        System.out.println("Quality");
        quality=sc.nextInt();
        System.out.println("Price:");
        price=sc.nextDouble();
    }
    public void calculate()
    {
        total=quality*price;
    }
    public void display()
    {
        System.out.println(pid+"\t"+pname+"\t"+quality+"\t"+price+"\t"+total);
    }
}
class Shop
{
    public static void main(String[] args) {
        int n,i,order_no;
        double namount=0;
        String date;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter bill details");
        System.out.println("______________________");
        System.out.println("Order No:");
        order_no=s.nextInt();
        System.out.println("Date");
        date=s.next();
        System.out.print("No of products:");
        n=s.nextInt();
        Bill ob[]=new Bill[n];
        for(i=0;i<n;i++)
        ob[i]=new Bill();
        for(i=0;i<n;i++)
        {
            ob[i].getdata();
            ob[i].calculate();
        }
        System.out.println("Order no:"+order_no);
        System.out.println("Date:"+date);
        System.out.println("Productid Name Quality Unitprice Total");
        System.out.println("______________________________________");
        for(i=0;i<n;i++)
        {
            ob[i].display();;
            namount+=ob[i].total;
        }
        System.out.println("");
        System.out.println("\t\t\t Net amount\t"+namount);
    }
}
