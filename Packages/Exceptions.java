public class Exceptions
{
    public static void main(String[] args)
    {
        // 1) ArithmeticException
        try
        {
            int result = 5 / 0;
            System.out.println("Result: " + result);
        }
        catch (ArithmeticException e)
        {
            e.printStackTrace();
        }
        // 2) ArrayIndexOutOfBoundsException
        try
        {
            int[] numbers = { 1, 2, 3 };
            int value = numbers[5];
            System.out.println("Value: " + value);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            e.printStackTrace();
        }
        // 3) NullPointerException
        try
        {
            String str = null;
            int length = str.length();
            System.out.println("String length: " + length);
        }
        catch (NullPointerException e)
        {
            e.printStackTrace();
        }
        // 4) NumberFormatException
        try
        {
            String numStr = "abc123";
            int number = Integer.parseInt(numStr);
            System.out.println("Parsed Number: " + number);
        }
        catch (NumberFormatException e) 
        { 
            e.printStackTrace();
        }
    }
}
