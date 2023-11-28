import java.util.*;
abstract class Shape
{
    int a,b;
    abstract void get();
    abstract void calc_area();
    abstract void put();
}
class square extends Shape
{
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of side of the square:");
        a=sc.nextInt();
    }
    void put()
    {
        System.out.println("Length :"+a);
    }
    void calc_area()
    {
        System.out.println("Area of this square :" + a*a);
    }
}
class rectangle extends Shape
{
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and width of the rectangle:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void put()
    {
        System.out.println("Length :"+a);
        System.out.println("Width :"+b);
    }
    void calc_area()
    {
        System.out.println("Area of this rectangle :" + a*b);
    }
}
class triangle extends Shape
{
    void get()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter height and base of the triangle:");
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void put(){
        System.out.println("Height :"+a);
        System.out.println("Base :"+b);
    }
    void calc_area()
    {
        System.out.println("Area of this triangle :" + (float)0.5*a*b);
    }
}
public class shape_details
{
    public static void main(String[] args)
    {
        Shape s1=new square();
        Shape s2=new rectangle();
        Shape s3=new triangle();
        s1.get();
        s1.put();
        s1.calc_area();
        s2.get();
        s2.put();
        s2.calc_area();
        s3.get();
        s3.put();
        s3.calc_area();
    }
}

