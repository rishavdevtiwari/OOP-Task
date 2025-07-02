// 2. Create a simple Employee Management System using inheritance:
// ● Define a base class Employee with name and ID.
// ● Create subclasses FullTimeEmployee and PartTimeEmployee with additional
// attributes.
// ● Override a method calculateSalary() in each subclass and display the salary

class Employee {
    String name;
    int id;
    
    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }
    
    void calculateSalary() {
        System.out.println("Calculating base salary...");
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;
    double bonus;
    
    FullTimeEmployee(String name, int id, double monthlySalary, double bonus) {
        super(name, id);
        this.monthlySalary = monthlySalary;
        this.bonus = bonus;
    }
    
    @Override
    void calculateSalary() {
        double total = monthlySalary + bonus;
        System.out.println("Full-time employee " + name + " salary: $" + total);
    }
}

class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;
    
    PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    void calculateSalary() {
        double total = hourlyRate * hoursWorked;
        System.out.println("Part-time employee " + name + " salary: $" + total);
    }
}

public class MainQ2 {
    public static void main(String[] args) {
        FullTimeEmployee ft = new FullTimeEmployee("Ram", 101, 5000, 1000);
        PartTimeEmployee pt = new PartTimeEmployee("Shaym", 102, 20, 80);
        
        ft.calculateSalary();
        pt.calculateSalary();
    }
}