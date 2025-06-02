//2. Write a Java program to create a class called Employee with methods called work() and getSalary(). 
//Create a subclass called HRManager that overrides the work() method.

class Employee{
    public void work(){
        System.out.println("Employee is working");
    }
    public void getSalary(){
        System.out.println("Employee salary is $5000");
    }
}

class HRManager extends Employee{
    @Override
    public void work(){
        System.out.println("New employee needs to learn");
    }
}

public class Office {
    public static void main(String[] args) {
      HRManager HR=new HRManager();
      HR.work();
      HR.getSalary();
    }
}
