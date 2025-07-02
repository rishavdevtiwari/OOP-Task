// 1. Write a Java program that demonstrates constructor overloading.
// ● Create a Product class with attributes like id, name, and price.
// ● Provide multiple constructors to initialize these attributes differently.
// ● Display the product details using a method.


class Product {
    int id;
    String name;
    double price;
    
    // Default constructor
    Product() {
        id = 0;
        name = "Unknown";
        price = 0.0;
    }
    
    // Constructor with id and name
    Product(int id, String name) {
        this.id = id;
        this.name = name;
        this.price = 0.0;
    }
    
    // Constructor with all attributes
    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}

public class MainQ1 {
    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product(101, "Laptop");
        Product p3 = new Product(102, "Phone", 599.99);
        
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();
    }
}