interface Area
{ 
    final float pi=3.14f;
    float cal_area(float dim1,float dim2);
}
class Circle implements Area
{
    public float cal_area(float dim1,float dim2)
    {
        return pi*dim1*dim1;
    }
}
class Rectangle implements Area
{
    public float cal_area(float dim1,float dim2)
    {
        return dim1*dim2;
    }
}
public class area_cal
{
    public static void main(String[] args)
    {
        Circle o1=new Circle();
        Rectangle o2=new Rectangle();
        System.out.println("Area of circle of radius 5.2 is:"+ o1.cal_area(5.4f,0)+" sq.unit");
        System.out.println();
        System.out.println("Area of rectangle of dimension 10, 4.2 is:"+ o2.cal_area(12f,3.4f)+" sq.unit");
    }
}

