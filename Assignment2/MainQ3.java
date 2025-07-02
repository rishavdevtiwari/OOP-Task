// 3. Implement a Java class Calculator that uses method overloading to perform the following:
// ● Add two integers
// ● Add two doubles
// ● Concatenate two strings
// ● Demonstrate all methods in the main method

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    
    double add(double a, double b) {
        return a + b;
    }
    
    String add(String a, String b) {
        return a + b;
    }
}

public class MainQ3 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Sum of integers: " + calc.add(5, 7));
        System.out.println("Sum of doubles: " + calc.add(3.5, 2.7));
        System.out.println("Concatenated strings: " + calc.add("Hello", " World"));
    }
}