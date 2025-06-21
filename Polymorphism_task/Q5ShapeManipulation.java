// 5. You are building a shape manipulation application. 
// There are different types of shapes, such as circles, squares, and triangles. 
// Each shape has its own resizing and rotation methods. 
// Implement a Java program using polymorphism to manipulate and transform different shapes.

abstract class Shape {
    abstract void resize(double factor);
    abstract void rotate(double degrees);
    abstract void display();
}

class Circle extends Shape {
    private double radius;
    
    Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    void resize(double factor) {
        radius *= factor;
    }
    
    @Override
    void rotate(double degrees) {
        System.out.println("Circle rotation has no visible effect");
    }
    
    @Override
    void display() {
        System.out.println("Circle with radius: " + radius);
    }
}

class Square extends Shape {
    private double side;
    private double rotation;
    
    Square(double side) {
        this.side = side;
        this.rotation = 0;
    }
    
    @Override
    void resize(double factor) {
        side *= factor;
    }
    
    @Override
    void rotate(double degrees) {
        rotation += degrees;
        rotation %= 360;
    }
    
    @Override
    void display() {
        System.out.println("Square with side: " + side + ", rotated by " + rotation + " degrees");
    }
}

class Triangle extends Shape {
    private double base;
    private double height;
    private double rotation;
    
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        this.rotation = 0;
    }
    
    @Override
    void resize(double factor) {
        base *= factor;
        height *= factor;
    }
    
    @Override
    void rotate(double degrees) {
        rotation += degrees;
        rotation %= 360;
    }
    
    @Override
    void display() {
        System.out.println("Triangle with base: " + base + ", height: " + height + 
                         ", rotated by " + rotation + " degrees");
    }
}

public class Q5ShapeManipulation {
    public static void main(String[] args) {
        Shape[] shapes = {
            new Circle(5),
            new Square(4),
            new Triangle(3, 6)
        };
        
        for (Shape shape : shapes) {
            shape.display();
            shape.resize(1.5);
            shape.rotate(45);
            shape.display();
            System.out.println();
        }
    }
}