import java.util.Scanner;
class Sports
{
    String sport;
    int rating;
    Sports(String sp,int rt)
    {
        sport=sp;
        rating=rt;
    }
}
class Student extends Sports
{
    String grade;
    double overall_per;
    Student (String sp,int rt,String gd,double per)
    {
        super(sp,rt);
        grade=gd;
        overall_per=per;
    }
}
class Result extends Student{
    Result(String sp,int rt,String gd,double per)
    {
        super(sp, rt, gd, per);
    }
void display()
{
    System.out.println("\n Sports details of student");
    System.out.println("______________________");
    System.out.println("Sport:"+sport);
    System.out.println("Rating :"+rating);
    System.out.println("Academic details of students");
    System.out.println("_________________");
    System.out.println("Academic grade:"+grade);
    System.out.println("Overall percentage:"+overall_per);
}
}
class School
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sports details of student");
        System.out.println("sport");
        String s=sc.next();
        System.out.print("Sport rating out of 10:");
        int r=sc.nextInt();
        System.out.println("Enter the academic details of student");
        System.out.println("Academic grade (A-D)");
        String g=sc.next();
        System.out.println("Overall percentage:");
        double p=sc.nextDouble();
        sc.close();
        Result obj=new Result(s,r,g,p);
        obj.display();
    }
