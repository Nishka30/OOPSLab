class Math_Operations
{
    public double calculateArea(double radius)
    {
        return Math.PI * Math.pow(radius, 2);
    }
    public double calculatePerimeter(double radius)
    {
        return 2 * Math.PI * radius;
    }
}
public class mathops
{
    public static void main(String[] args)
    {
        Math_Operations o = new Math_Operations();
        double radius = 6.0;
        double area = o.calculateArea(radius);
        double perimeter = o.calculatePerimeter(radius);
        System.out.println("Circle with radius " + radius+" units");
        System.out.println("Area: " + area+" sq.units");
        System.out.println("Perimeter: " + perimeter+" units");
    }
}
