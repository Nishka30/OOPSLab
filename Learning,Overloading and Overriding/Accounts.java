class Account {
    private int accNo;
    private String customerName;
    private String contactNo;   

    public Account(int accNo, String customerName, String contactNo) {
        this.accNo = accNo;
        this.customerName = customerName;
        this.contactNo = contactNo;
    }

    public void show() {
        System.out.println("Account Number: " + accNo);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Contact Number: " + contactNo);
    }
}

class SavingsAccount extends Account {
    private double interestRate;
    private double accountBalance;

    public SavingsAccount(int accNo, String customerName, String contactNo, double interestRate, double accountBalance) {
        super(accNo, customerName, contactNo);
        this.interestRate = interestRate;
        this.accountBalance = accountBalance;
    }

    public void showData() {
        super.show();
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Account Balance: " + accountBalance);
    }

    public void compute() {
        // Add specialized computations for Savings Account, if needed
    }
}

class CurrentAccount extends Account {
    private double accountBalance;
    private double minBalance;

    public CurrentAccount(int accNo, String customerName, String contactNo, double accountBalance, double minBalance) {
        super(accNo, customerName, contactNo);
        this.accountBalance = accountBalance;
        this.minBalance = minBalance;
    }

    public void showData() {
        super.show();
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Minimum Balance: " + minBalance);
    }

    public void compute() {
        // Add specialized computations for Current Account, if needed
    }
}

class TDAccount extends Account {
    private double principal;
    private int term;
    private double interestRate;
    private double maturityBalance;

    public TDAccount(int accNo, String customerName, String contactNo, double principal, int term, double interestRate, double maturityBalance) {
        super(accNo, customerName, contactNo);
        this.principal = principal;
        this.term = term;
        this.interestRate = interestRate;
        this.maturityBalance = maturityBalance;
    }

    public void showData() {
        super.show();
        System.out.println("Principal Amount: " + principal);
        System.out.println("Term: " + term);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Maturity Balance: " + maturityBalance);
    }

    public void compute() {
        // Add specialized computations for Term Deposit Account, if needed
    }
}

public class Accounts {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount(1, "John Doe", "1234567890", 0.05, 1000.0);
        savingsAccount.showData();
        savingsAccount.compute();

        System.out.println();

        CurrentAccount currentAccount = new CurrentAccount(2, "Jane Smith", "9876543210", 2000.0, 500.0);
        currentAccount.showData();
        currentAccount.compute();

        System.out.println();

        TDAccount tdAccount = new TDAccount(3, "Bob Johnson", "1112233445", 5000.0, 3, 0.08, 6000.0);
        tdAccount.showData();
        tdAccount.compute();
    }
}