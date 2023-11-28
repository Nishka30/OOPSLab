abstract class Bird
{
    String name,colour;
    Bird(String n, String c)
    {
        name=n;
        colour=c;
    }
    abstract void Fly();
}
class FlyingBird extends Bird
{
    FlyingBird(String n, String c)
    {
        super(n, c);
    }
    void Fly()
    {
        Boolean flying_status = true;
        System.out.println("\nBird Name: "+name+"\tColour: "+colour+"\t \t Flying Status: "+flying_status);
    }
}
class NonFlying_Bird extends Bird
{
    NonFlying_Bird(String n, String c)
    {
        super(n, c);
    }
    void Fly()
    {
        Boolean flying_status = false;
        System.out.println("\nBird Name: "+name+"\tColour: "+colour+"\t \t Flying Status: "+flying_status);
    }
}
public class Bird_info
{
    public static void main(String[] args)
    {
        FlyingBird ob1=new FlyingBird("Eagle","Brown");
        ob1.Fly();
        NonFlying_Bird ob2=new NonFlying_Bird("Penguin","White");
        ob2.Fly();
    }    
}










