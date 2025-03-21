class Manager{
    int salary=10000;
}
class TeamLead extends Manager
{
    String teamname="DevOps";
}
class Developer extends TeamLead{

    int prjcid=101;
    void putdata()
    {
        System.out.println("Salary:"+salary);
        System.out.println("Team Name:"+teamname);
        System.out.println("ProjectID:"+prjcid);
    }
}
public class CompanyDetails {

    public static void main(String[] args) {
        Developer ob=new Developer();
        ob.putdata();
    }
}
