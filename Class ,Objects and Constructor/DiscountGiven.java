class DiscountGiven {
    private double salesAmount;
    private double discount;

    // Constructor to input salesAmount
    public DiscountGiven(double salesAmount) {
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
        // Test with different sales amounts
        double salesAmount1 = 8000;  // No discount
        double salesAmount2 = 15000; // 3% discount
        double salesAmount3 = 30000; // 5% discount
        double salesAmount4 = 50000; // 10% discount

        // Create Discount objects and compute discounts
        DiscountGiven discountObj1 = new DiscountGiven(salesAmount1);
        discountObj1.compute1();
        System.out.println("Test 1:");
        discountObj1.display();
        System.out.println();

        DiscountGiven discountObj2 = new DiscountGiven(salesAmount2);
        discountObj2.compute1();
        System.out.println("Test 2:");
        discountObj2.display();
        System.out.println();

        DiscountGiven discountObj3 = new DiscountGiven(salesAmount3);
        discountObj3.compute1();
        System.out.println("Test 3:");
        discountObj3.display();
        System.out.println();

        DiscountGiven discountObj4 = new DiscountGiven(salesAmount4);
        discountObj4.compute1();
        System.out.println("Test 4:");
        discountObj4.display();
    }
}

