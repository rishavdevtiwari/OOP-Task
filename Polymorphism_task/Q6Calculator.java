// 6. You are designing a calculator application. Create a class called "Calculator" with the following overloaded methods:

// a) int add(int a, int b) - This method should add two integers and return the result.

// b) double add(double a, double b) - This method should add two doubles and return the result.

// c) int add(int a, int b, int c) - This method should add three integers and return the result.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Q6Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("2 + 3 = " + calc.add(2, 3));
        System.out.println("2.5 + 3.7 = " + calc.add(2.5, 3.7));
        System.out.println("2 + 3 + 4 = " + calc.add(2, 3, 4));
    }
}