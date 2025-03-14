import java.util.Scanner;
public class EmpNetPay {
    int empid,TA,DA,HRA,Tax,netsal,basic;
    String empname;
    void getdata()
    {
      Scanner scan=new Scanner(System.in);
      System.out.println("Enter employee name,id,Basic pay,TA,DA,HRA and Tax");
      empname=scan.nextLine();
      empid=scan.nextInt();
      basic=scan.nextInt();
      TA=scan.nextInt();
      DA=scan.nextInt();
      HRA=scan.nextInt();
      Tax=scan.nextInt();
    }
    void calc()
    {
        netsal=(basic+TA+DA+HRA)-Tax;
        System.out.println("Net salary:"+netsal);
    }
    public static void main(String[] args) {
        EmpNetPay e1=new EmpNetPay();
        e1.getdata();
        System.out.println("\n Employee detailos");
        System.out.println("___________________");
        System.out.println("Employee id:"+e1.empid);
        System.out.println("Employee name:"+e1.empname);
        e1.calc();
    }
    
}
