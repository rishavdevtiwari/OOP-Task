// 4. You are working on a restaurant ordering system. 
// There are different types of menu items, 
// such as appetizers, main courses, and beverages. 
// Each menu item has its own preparation and 
// serving methods. 
// Implement a Java program using polymorphism 
// to handle the ordering and preparation of different 
// types of menu items.

abstract class MenuItem {
    protected String name;
    protected double price;
    
    MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    abstract void prepare();
    abstract void serve();
}

class Appetizer extends MenuItem {
    Appetizer(String name, double price) {
        super(name, price);
    }
    
    @Override
    void prepare() {
        System.out.println("Preparing appetizer: " + name);
        System.out.println("- Chilling plate");
        System.out.println("- Arranging presentation");
    }
    
    @Override
    void serve() {
        System.out.println("Serving appetizer: " + name + " with small fork");
    }
}

class MainCourse extends MenuItem {
    MainCourse(String name, double price) {
        super(name, price);
    }
    
    @Override
    void prepare() {
        System.out.println("Preparing main course: " + name);
        System.out.println("- Cooking ingredients");
        System.out.println("- Plating with sides");
    }
    
    @Override
    void serve() {
        System.out.println("Serving main course: " + name + " with dinner set");
    }
}

class Beverage extends MenuItem {
    Beverage(String name, double price) {
        super(name, price);
    }
    
    @Override
    void prepare() {
        System.out.println("Preparing beverage: " + name);
        System.out.println("- Adding ice if requested");
        System.out.println("- Garnishing");
    }
    
    @Override
    void serve() {
        System.out.println("Serving beverage: " + name + " with straw and napkin");
    }
}

public class Q4Restaurant {
    public static void main(String[] args) {
        MenuItem[] order = {
            new Appetizer("Bruschetta", 8.99),
            new MainCourse("Steak", 24.99),
            new Beverage("Iced Tea", 2.99)
        };
        
        for (MenuItem item : order) {
            item.prepare();
            item.serve();
            System.out.println("Price: $" + item.price + "\n");
        }
    }
}