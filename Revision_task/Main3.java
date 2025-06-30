// 3. Implement a Java program that simulates a Bank Account system:
// ● Create a class BankAccount with accountNumber, holderName, and balance.
// ● Include methods to deposit(), withdraw(), and display() balance.
// ● Add validations to prevent withdrawal beyond the available balance.
// ● Demonstrate the working with a sample account in the main method.

class BankAccount {
    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accNum, String name, double bal) {
        accountNumber = accNum;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Rs."+ amount + " deposited. New balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= amount;
            System.out.println("Rs." + amount + " withdrawn. Remaining balance: " + balance);
        }
    }

    void display() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

public class Main3 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("12345", "Ram Thapa", 1000);
        acc.deposit(500);    
        acc.withdraw(200);
        acc.withdraw(2000);  
        acc.display();
    }
}