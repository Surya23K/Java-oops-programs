class Parent
{
    int pid;
    Parent(int id)
    {
        pid=id;
    }
}
class Child extends Parent{
    String course;
    Child(int pid,String course1)
    {
        super(pid);
        course=course1;
    }
    void putdata()
    {
        System.out.println("Pid:"+pid);
        System.out.println("course:"+course);
    }
}
class SuperInheritance{
public static void main(String[] args) {
    Child ob=new Child(25,"Ami");
    ob.putdata();
}    
}
