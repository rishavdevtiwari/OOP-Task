public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        // Changed from setSalary() to direct assignment with validation
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Salary cannot be negative. Setting to 0.");
            this.salary = 0;
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getSalary() {
        return salary;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    // Special salary adjustment method (replaces setSalary)
    public void adjustSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
        } else {
            System.out.println("Salary adjustment would result in negative value. Adjustment not applied.");
        }
    }
}