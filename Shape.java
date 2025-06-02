//5. Implement a class hierarchy for various shapes.
//Create a base class 'Shape' with a method 'calculateArea()'. 
//Derive two classes 'Rectangle' and 'Circle' from 'Shape'. 
//Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. 
//Write a Java program to demonstrate hierarchical inheritance and compute the area and 
//perimeter/circumference for a rectangle and a circle object.

class Shapes{
    int length;
    int breadth;
    int radius;
    Shapes(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
    }
    Shapes(int radius){
        this.radius=radius;
    }
}

class Rectangle extends Shapes{
    Rectangle(int length){
        super(length);
    }
    void calculatePerimeter(){
        System.out.println("Perimeter of rectangle is"+super.length*4);
    }
}

class Circle extends Shapes{
    Circle(int radius){
        super(radius);
    }
    void calculateCircumference(){
        System.out.println("Circumference of circle is"+2*super.radius*3.14);
    }
}

public class Shape{
public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(10);
    rectangle.calculatePerimeter();
    Circle circle = new Circle(5);
    circle.calculateCircumference();
}
}
