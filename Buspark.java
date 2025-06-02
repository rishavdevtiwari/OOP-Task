//1. Write a Java program to create a class called Vehicle with a method called drive().
// Create a subclass called Car with method display() method to print details of the Car.

class Vehicle{
    public void drive() {
        System.out.println("Vehicle is driving");
    }
}

class Car extends Vehicle{
    public void display() {
        System.out.println("Car is driving at 60mph");
        System.out.println("Car is the model Nissan 5600");
    }
}

public class Buspark{
    public static void main(String[] args) {
        Car car=new Car();
        car.drive();
        car.display();
    }
}