// 9. You are developing a banking application that includes different types of accounts. 
// Each account has a method named calculateInterest to calculate the interest based on the account type. 
// Implement the calculateInterest method in the base class Account and override it in the derived classes 
// SavingsAccount and FixedDepositAccount to calculate interest based on their specific rules. 
// Write the code to demonstrate method overriding for calculating interest.

class Account {
    protected double balance;
    
    Account(double balance) {
        this.balance = balance;
    }
    
    double calculateInterest() {
        return 0; 
    }
}

class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.03; // 3/100
    
    SavingsAccount(double balance) {
        super(balance);
    }
    
    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE;
    }
}

class FixedDepositAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5/100
    private int termMonths;
    
    FixedDepositAccount(double balance, int termMonths) {
        super(balance);
        this.termMonths = termMonths;
    }
    
    @Override
    double calculateInterest() {
        return balance * INTEREST_RATE * (termMonths / 12.0);
    }
}

public class Q9BankingApp {
    public static void main(String[] args) {
        Account[] accounts = {
            new Account(1000),
            new SavingsAccount(1000),
            new FixedDepositAccount(1000, 12)
        };
        
        for (Account acc : accounts) {
            System.out.println("Interest: $" + acc.calculateInterest());
        }
    }
}