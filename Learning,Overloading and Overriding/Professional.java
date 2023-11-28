class ComputerProfessional
{
    private String EName;
    private double DutyHour;
    private String Prospect;
    ComputerProfessional(String a,double b,String c)
    {
        this.EName=a;
        this.DutyHour=b;
        this.Prospect=c;
    }
    void display()
    {
        System.out.println("Employee Name: "+EName);
        System.out.println("DutyHours: "+DutyHour);
        System.out.println("Prospect: "+Prospect);
     }
}

class Devloper extends ComputerProfessional
{
    private double StudyHour;
    Devloper(String a,double b,String c,double d)
    {
        super(a,b,c);
        StudyHour=d;
    }
    void display()
    {
        super.display();
        System.out.println("Study Hours="+StudyHour);
    }
}

class NetworkAdmin extends ComputerProfessional
{
    private double PracticeHour;
    NetworkAdmin(String a,double b,String c,double d)
    {
        super(a,b,c);
        PracticeHour=d;
    }
    void display()
    {
        System.out.println("Details of Network Admin: ");
        super.display();
        System.out.println("Practice Hours="+PracticeHour);
    }
}

class DataOperator extends ComputerProfessional
{
    private double TypingSpeed;
    DataOperator(String a,double b,String c,double d)
    {
        super(a,b,c);
        TypingSpeed=d;
    }
    void display()
    {
        System.out.println("Details of Data Operator: ");
        super.display();
        System.out.println("Typing Speed= "+TypingSpeed);
    }
}

class JavaProfessional extends Devloper
{
    private String ProficiencyLevel;
    JavaProfessional(String a,double b,String c,double d,String e)
    {
        super(a,b,c,d);
        ProficiencyLevel=e;
    }
    void display()
    {
        System.out.println("Details of Java Professional: ");
        super.display();
        System.out.println("Proficiency Level: "+ProficiencyLevel);
    }
}

class PythonProfessional extends Devloper
{
    private String ProficiencyLevel;
    PythonProfessional(String a,double b,String c,double d,String e)
    {
        super(a,b,c,d);
        ProficiencyLevel=e;
    }
    void display()
    {
        System.out.println("Details of Python Professional:- ");
        super.display();
        System.out.println("Proficiency Level: "+ProficiencyLevel);
    }
}

public class Professional
{
    public static void main(String args[])
    {
        NetworkAdmin ob=new NetworkAdmin("Arijit",8.0,"Fair",4.2);
        ob.display();
        System.out.println();
        DataOperator ob1=new DataOperator("Aritra",7.5,"Excellent",8.0);
        ob1.display();
        System.out.println();
        JavaProfessional ob2=new JavaProfessional("Rahul",6.0,"Good",5.0,"Intermediate");
        ob2.display();
        System.out.println();
        PythonProfessional ob3=new PythonProfessional("Shubhomay",5.0,"Excellent",5.5,"Pro");
        ob3.display();
    }
}


