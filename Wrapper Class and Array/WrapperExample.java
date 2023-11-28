public class WrapperExample {
    public static void main(String[] args) {
        // Part a) Convert primitive data types to corresponding wrapper objects
        Integer intWrapper = Integer.valueOf(10);   //Converts the primitive int value 10 to an Integer wrapper object.
        Character charWrapper = Character.valueOf('A');
        Float floatWrapper = Float.valueOf(3.14f);
        Double doubleWrapper = Double.valueOf(2.718);

        // Part b) Store null values in int and float variables using wrapper objects
        Integer nullIntWrapper = null;
        Float nullFloatWrapper = null;

        // Part c) Store wrapper objects into primitive types
        int intPrimitive = intWrapper.intValue();   //Extracts the primitive int value from the Integer wrapper object intWrapper
        float floatPrimitive = floatWrapper.floatValue();

        // Display the values
        System.out.println("Converted Wrapper Objects:");
        System.out.println("Integer: " + intWrapper);
        System.out.println("Character: " + charWrapper);
        System.out.println("Float: " + floatWrapper);
        System.out.println("Double: " + doubleWrapper);

        System.out.println("\nStoring null values:");
        System.out.println("Null Integer: " + nullIntWrapper);
        System.out.println("Null Float: " + nullFloatWrapper);

        System.out.println("\nConverting Wrapper Objects to Primitive Types:");
        System.out.println("intPrimitive: " + intPrimitive);
        System.out.println("floatPrimitive: " + floatPrimitive);

        // Part d) Check character types in an array
        char[] charArray = {'A', 'b', '5', ' ', '$'};

        for (char ch : charArray) {
            if (Character.isLowerCase(ch)) {
                System.out.println(ch + " is a lowercase character.");
            } else if (Character.isUpperCase(ch)) {
                System.out.println(ch + " is an uppercase character.");
            } else if (Character.isDigit(ch)) {
                System.out.println(ch + " is a digit.");
            } else if (Character.isWhitespace(ch)) {
                System.out.println(ch + " is a whitespace character.");
            } else {
                System.out.println(ch + " is a special character.");
            }
        }
    }
}