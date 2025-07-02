// 3. Create a program that demonstrates the use of static variables and methods:
// ● Define a class Counter that tracks how many objects have been created.
// ● Use a static variable and a static method to display the total count.
// ● Test it by creating multiple objects in the main method.

class Counter {
    static int count = 0; // Static variable
    
    Counter() {
        count++; // Increment on object creation
    }
    
    static void displayCount() { // Static method
        System.out.println("Total objects: " + count);
    }
}

public class MainQ3 {
    public static void main(String[] args) {
        new Counter();
        new Counter();
        Counter.displayCount(); 
    }
}