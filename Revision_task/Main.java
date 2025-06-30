// 1. Create a Java program that demonstrates inheritance:
// ● Define a superclass Vehicle with attributes brand and a method start().
// ● Create a subclass Car that adds a model name and overrides the start() method.
// ● Use the super keyword appropriately.
// ● Demonstrate the working in the main method.


// Parent class
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println(brand + " is starting.");
    }
}

// Child class
class Car extends Vehicle {
    String model;

    Car(String brand, String model) {
        super(brand);  //constructor called
        this.model = model;
    }

    @Override
    void start() {
        super.start();  // parent class's method called using super keyword
        System.out.println(model + " car is ready to drive!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Corolla");
        myCar.start();
    }
}