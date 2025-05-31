public class Oopq4 {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", "Software Engineer", 75000);
        
        System.out.println("Initial Employee Details:");
        emp.displayDetails();
        
        double bonus = emp.calculateBonus(10); // 10% bonus
        System.out.println("\nBonus: $" + bonus);
        
        emp.updateSalary(80000);
        System.out.println("\nAfter salary update:");
        emp.displayDetails();
    }
}

class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public double calculateBonus(double percentage) {
        return salary * percentage / 100;
    }

    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: $" + salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}