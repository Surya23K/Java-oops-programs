class Product 
    {
        int pcode;
        String pname;
        double price;
        Product (int c,String n,double p)
        {
            pcode=c;
            pname=n;
            price=p;
        }
        void display()
        {
            System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
        }
        void findLowest(double price1,double price2,double price3)
        {
            if(price1<price2&&price1<price3)
            {
                System.out.println("PRODUCT 1 IS OF LOWEST PRICE");
            }
            else if(price2<price1&&price2<price3)
            {
                System.out.println("product 2 is of lowest price");
            }
            else
            {
                System.out.println("Product3 is of lowest price");
            }
        }
    }
public class ProductDemo{
    public static void main(String[] args)
    {
    Product obj1=new Product(101,"Product1",100.0);
    Product obj2=new Product(102,"Product2",128.40);
    Product obj3=new Product(103,"Product3",790.00);
    System.out.println("Product Information");
    System.out.println("_____________________");
    System.out.println("Product_code\t product_name\t product_price");
    obj1.display();
    obj2.display();
    obj3.display();
    obj1.findLowest(obj1.price,obj2.price,obj3.price);
}
}
