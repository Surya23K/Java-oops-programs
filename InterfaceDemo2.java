interface Shape
{
    int length=10;
    void display();
}
class Rectangle implements Shape
{
    int breadth=20;
    public void display()
    {
        System.out.println("Length:"+length);
        System.out.println("Breadth:"+breadth);
    }
}
class InterfaceDemo2
{
    public static void main(String[] args) {
        Rectangle obj=new Rectangle();
        obj.display();
    }
}