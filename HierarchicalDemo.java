import java.util.Scanner;;
class Manager
{
    String mngrName;
    Manager(String mname)
    {
        mngrName=mname;
    }
}
class Employee extends Manager{
    String empName;
    Employee( String mname,String ename)
    {
        super(mname);
        empName=ename;
    }
    void display()
    {
        System.out.println("Manager:"+mngrName);
        System.out.println("Employee:"+empName);
    }
}
class Staff extends Manager
{
    String stfName;
    Staff(String mname,String sname)
    {
        super(mname);
        stfName=sname;
    }
    void display()
    {
        System.out.println("Manager:"+mngrName);
        System.out.println("Staff:"+stfName);
    }
}
public class HierarchicalDemo {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter details:");
        System.out.println("Manager name");
        String m=s.next();
        System.out.print("Employee name:");
        String e=s.next();
        System.out.println("Staff name:");
        String st=s.next();
        Employee ob1=new Employee(m, e);
        System.out.println("Manager-Employee details");
        System.out.println("______________");
        ob1.display();
        Staff ob2=new Staff(m,st);
        System.out.println("Manager-staff details");
        System.out.println("__________");
        ob2.display();
        s.close();     
    }
}