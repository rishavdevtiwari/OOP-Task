//3. Imagine that you are building a geometry calculator program. You need to implement the calculation of areas for different shapes, including rectangles, squares, and circles. 
//To achieve this, you decide to use a multilevel inheritance hierarchy.

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
    Rectangle(int length, int breadth){
        super(length, breadth);
    }
    void calculateArea(){
        System.out.println("Area of rectangle is"+super.length*super.breadth);
    }
}

class Circle extends Shapes{
    Circle(int radius){
        super(radius);
    }
    void calculateArea(){
        System.out.println("Area of circle is"+super.radius*2*super.radius*3.14);
    }
}

public class GeometryCalc {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 20);
        rectangle.calculateArea();
        Circle circle=new Circle(15);
        circle.calculateArea();
    }
}
