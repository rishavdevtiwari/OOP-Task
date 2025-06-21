// 1. You are developing a shape drawing application. 
// There are different types of shapes such as circles, rectangles, and triangles. 
// Each shape has its own area calculation method. 
// Implement a Java program using polymorphism to calculate and display the area of different shapes.

abstract class Shape {
    abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    double calculateArea() {
        return (Math.PI * radius * radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    double calculateArea() {
        return (length * width);
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    @Override
    double calculateArea() {
        return (0.5 * base * height);
    }
}

public class Q1Shape {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Rectangle(4, 6),
            new Triangle(3, 7)
        };
        
        for (Shape shape : shapes) {
            System.out.println("Area: " + shape.calculateArea());
        }
    }
}