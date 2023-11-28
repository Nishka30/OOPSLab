import java.util.Scanner;

class Discount {
    private double salesAmount;
    private double discount;

    // Constructor to input salesAmount
    public Discount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    // Method to compute discount using if-else construct
    public void compute1() {
        if (salesAmount < 10000) {
            discount = 0;
        } else if (salesAmount >= 10000 && salesAmount < 20000) {
            discount = 0.03 * salesAmount;
        } else if (salesAmount >= 20000 && salesAmount < 40000) {
            discount = 0.05 * salesAmount;
        } else {
            discount = 0.1 * salesAmount;
        }
    }

    // Method to compute discount using ternary operator
    public void compute2() {
        discount = (salesAmount < 10000) ? 0 :
                   (salesAmount < 20000) ? 0.03 * salesAmount :
                   (salesAmount < 40000) ? 0.05 * salesAmount :
                   0.1 * salesAmount;
    }

    // Method to display the calculated discount
    public void display() {
        System.out.println("Sales Amount: INR " + salesAmount);
        System.out.println("Discount: INR " + discount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input salesAmount from the user
        System.out.print("Enter Sales Amount: INR ");
        double salesAmount = scanner.nextDouble();

        // Create Discount object and compute discounts
        Discount discountObj = new Discount(salesAmount);
        discountObj.compute1(); // Choose compute1() or compute2()
        discountObj.display();
    }
}
