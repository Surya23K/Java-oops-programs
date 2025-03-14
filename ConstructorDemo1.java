class Employee{
    int eno;
    String ename;
    Employee (int eno1,String ename1)
    {
        eno=eno1;
        ename=ename1;
    }
    void display()
    {
        System.out.println("Student Details");
        System.out.println("_______________");
        System.out.println("Name :"+ename);
        System.out.println("Employee No:"+eno);
    }
}
public class ConstructorDemo1
{
    public static void main(String[] args) {
        Employee obj=new Employee(101,"Anjali");
        obj.display();
    }
}
