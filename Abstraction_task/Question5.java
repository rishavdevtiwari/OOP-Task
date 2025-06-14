//5. You are building a shape hierarchy for a drawing application. 

//Design an abstract class named "Draw" with the following abstract methods:

//calculateVolume(): This method should calculate and return the area of the shape

//calculateArea(): This method should calculate and return the area of the shape.

//calculatePerimeter(): This method should calculate and return the perimeter of the shape.

//Implement the abstract class and provide concrete implementations for the abstract methods. 

//Create subclasses for different shapes such as "Cube," "Cuboid," and "Cylinder." 

//Each subclass should provide specific implementations for calculating the volume, area and perimeter of that shape. 

//Create instances of each shape class and demonstrate how you can calculate their respective volume, areas and perimeters.



abstract class Draw {
    public abstract double calculateVolume();
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Cube extends Draw {
    private double side;
    
    public Cube(double side) {
        this.side = side;
    }
    
    @Override
    public double calculateVolume() {
        return side * side * side;
    }
    
    @Override
    public double calculateArea() {
        return 6 * side * side;
    }
    
    @Override
    public double calculatePerimeter() {
        return 12 * side;
    }
}

class Cuboid extends Draw {
    private double length;
    private double width;
    private double height;
    
    public Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        return length * width * height;
    }
    
    @Override
    public double calculateArea() {
        return 2 * (length*width + width*height + height*length);
    }
    
    @Override
    public double calculatePerimeter() {
        return 4 * (length + width + height);
    }
}

class Cylinder extends Draw {
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }
    
    @Override
    public double calculateVolume() {
        return Math.PI * radius * radius * height;
    }
    
    @Override
    public double calculateArea() {
        return 2 * Math.PI * radius * (radius + height);
    }
    
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

public class Question5 {
    public static void main(String[] args) {
        Cube cube = new Cube(3);
        Cuboid cuboid = new Cuboid(2, 3, 4);
        Cylinder cylinder = new Cylinder(3, 5);
        
        System.out.println("Cube - Volume: " + cube.calculateVolume() + 
                         " Area: " + cube.calculateArea() + 
                         " Perimeter: " + cube.calculatePerimeter());
        
        System.out.println("Cuboid - Volume: " + cuboid.calculateVolume() + 
                         " Area: " + cuboid.calculateArea() + 
                         " Perimeter: " + cuboid.calculatePerimeter());
        
        System.out.println("Cylinder - Volume: " + cylinder.calculateVolume() + 
                         " Area: " + cylinder.calculateArea() + 
                         " Perimeter: " + cylinder.calculatePerimeter());
    }
}