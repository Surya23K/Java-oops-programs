class Student{
    int rno;
    String name;
    Student(int r,String n)
    {
        rno=r;
        name=n;
    }
    void display()
    {
        System.out.println("Student details");
        System.out.println("_________");
        System.out.println("NAME:"+name);
        System.out.println("Roll no:"+rno);
    }
}
public class ConstructorDemo {
public static void main(String[]args)
{
    Student ob=new Student(12,"Anu");
    ob.display();
}
}
