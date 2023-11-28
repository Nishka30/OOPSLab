class Complex {
    private int a, b; // Data members

    // Parameterized constructor
    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to add two Complex numbers
    public Complex add(Complex complex) {
        int realPart = this.a + complex.a;
        int imaginaryPart = this.b + complex.b;
        return new Complex(realPart, imaginaryPart);   // (al+ibl) + (a2+ib2) = (al+a2) + i(bl +b2)]
    }

    // Method to subtract two Complex numbers
    public Complex sub(Complex complex) {
        int realPart = this.a - complex.a;
        int imaginaryPart = this.b - complex.b;
        return new Complex(realPart, imaginaryPart);
    }

    // Method to display the Complex number
    public void display() {
        System.out.println(a + " + " + b + "i");
    }

    public static void main(String[] args) {
        // Create two Complex objects
        Complex complex1 = new Complex(3, 4);
        Complex complex2 = new Complex(1, 2);

        // Perform addition and display the result
        Complex sum = complex1.add(complex2);
        System.out.print("Sum: ");
        sum.display();

        // Perform subtraction and display the result
        Complex difference = complex1.sub(complex2);
        System.out.print("Difference: ");
        difference.display();
    }
}
