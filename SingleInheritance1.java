class InheritanceDemo
{
    int id=101;
    String ename="Anitha";
}
class ChildInheritance extends InheritanceDemo
{
    int age=20;
    void putdata()
    {
        System.out.println("Id:"+id);
        System.out.println("Ename:"+ename);
        System.out.println("Age:"+age);
     }
    }
    class SingleInheritance1
    {
        public static void main(String[]args)
        {
            ChildInheritance ob=new ChildInheritance();
            ob.putdata();
        }
    }