// 7. You are building a geometry application. Create a class called "Geometry" with the following overloaded methods:

// a) double calculateArea(double radius) 
// - This method should calculate and return the area of a circle with the given radius.

// b) double calculateArea(double length, double width) 
// - This method should calculate and return the area of a rectangle with the given length and width.

// c) double calculateArea(double base, double height, boolean type) 
// - This method should calculate and return the area of a triangle with the given base and height.

class Geometry {
    double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    
    double calculateArea(double length, double width) {
        return length * width;
    }
    
    double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class Q7Geometry {
    public static void main(String[] args) {
        Geometry geo = new Geometry();
        
        System.out.println("Circle area (radius=5): " + geo.calculateArea(5));
        System.out.println("Rectangle area (4x6): " + geo.calculateArea(4, 6));
        System.out.println("Triangle area (base=3, height=4): " + 
                         geo.calculateArea(3, 4, true));
    }
}