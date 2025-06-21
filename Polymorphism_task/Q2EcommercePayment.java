// 2. You are working on an e-commerce application where different payment methods are supported, 
// including credit card, PayPal, and bank transfer. 
// Each payment method has its own validation and transaction process. 
// Implement a Java program using polymorphism to process payments using different payment methods.

interface PaymentMethod {
    boolean validate();
    void processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    
    CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
    
    @Override
    public boolean validate() {
        return cardNumber.length() == 16 && expiryDate.matches("\\d{2}/\\d{2}");
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

class PayPal implements PaymentMethod {
    private String email;
    
    PayPal(String email) {
        this.email = email;
    }
    
    @Override
    public boolean validate() {
        return email.contains("@") && email.contains(".");
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " from " + email);
    }
}

class BankTransfer implements PaymentMethod {
    private String accountNumber;
    
    BankTransfer(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    
    @Override
    public boolean validate() {
        return accountNumber.length() >= 8;
    }
    
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer of $" + amount + " to account " + accountNumber);
    }
}

public class Q2EcommercePayment {
    public static void main(String[] args) {
        PaymentMethod[] payments = {
            new CreditCard("1234567812345678", "12/25"),
            new PayPal("user@example.com"),
            new BankTransfer("12345678")
        };
        
        double amount = 100.0;
        for (PaymentMethod payment : payments) {
            if (payment.validate()) {
                payment.processPayment(amount);
            } else {
                System.out.println("Payment validation failed");
            }
        }
    }
}