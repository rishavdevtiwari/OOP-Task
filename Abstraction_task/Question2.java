//2. Create an abstract class called Shape with an abstract method called calculateArea(). 
//Implement two subclasses called Rectangle and Circle that inherit from Shape. 
//Override the calculateArea() method in both subclasses to calculate and 
//return the area of a rectangle and a circle, respectively. 
//Write the Java code to implement this scenario with Scanner Input.

import java.util.Scanner;

abstract class Shape {
    public abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        System.out.println("Rectangle area: " + rectangle.calculateArea());
        
        System.out.print("Enter circle radius: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);
        System.out.println("Circle area: " + circle.calculateArea());
        
        scanner.close();
    }
}
