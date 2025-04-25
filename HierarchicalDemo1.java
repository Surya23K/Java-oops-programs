import java.util.Scanner;;
class Hospital
{
    String hosName;
    Hospital(String hname)
    {
        hosName=hname;
    }
}
class Doctor extends Hospital{
    String docName;
    Doctor( String hname,String dname)
    {
        super (hname);
        docName=dname;
    }
    void putdata()
    {
        System.out.println("Hospital:"+hosName);
        System.out.println("Doctor:"+docName);
    }
}
class Nurse extends Hospital
{
    String nurseName;
    Nurse(String hname,String nurname)
    {
        super(hname);
        nurseName=nurname;
    }
    void putdata()
    {
        System.out.println("Hospital:"+hosName);
        System.out.println("Nurse:"+nurseName);
    }
}
public class HierarchicalDemo1 {
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter details:");
        System.out.println("Hospital name");
        String h=s.next();
        System.out.print("Doctor name:");
        String d=s.next();
        System.out.println("Nurse name:");
        String n=s.next();
        Doctor ob1=new Doctor(h,d);
        System.out.println("Hospital-Doctor details");
        System.out.println("______________");
        ob1.putdata();
        Nurse ob2=new Nurse(h,n);
        System.out.println("Hospital-Nurse details");
        System.out.println("__________");
        ob2.putdata();
        s.close();     
    }
}