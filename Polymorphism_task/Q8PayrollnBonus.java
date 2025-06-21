// 8. You are building a payroll system for a company. 
// The system has a class Employee with a method calculateSalary() to calculate the salary of an employee. 
// Now, you need to create a derived class Manager that inherits from Employee and overrides the calculateSalary() 
// method to include a bonus calculation based on the performance. 
// Implement the classes and demonstrate method overriding for calculating the salary of a manager.

class Employee {
    protected double baseSalary;
    
    Employee(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    private double performanceBonus;
    
    Manager(double baseSalary, double performanceBonus) {
        super(baseSalary);
        this.performanceBonus = performanceBonus;
    }
    
    @Override
    double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

public class Q8PayrollnBonus {
    public static void main(String[] args) {
        Employee emp = new Employee(50000);
        Manager mgr = new Manager(70000, 15000);
        
        System.out.println("Employee salary: $" + emp.calculateSalary());
        System.out.println("Manager salary: $" + mgr.calculateSalary());
    }
}