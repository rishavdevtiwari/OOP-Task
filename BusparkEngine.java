//4. Design a class hierarchy for different types of vehicles. 
//Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. 
//Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'.
// Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. 
//Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.

class Vehicle{
    void startEngine() {
        System.out.println("Engine start tutututu");
    }
    void stopEngine(){
        System.out.println("Engine stop pspspspsps");
    }
}

class Car extends Vehicle{
void drive(){
    System.out.println("Car is driving");
}
}
class Toyota extends Car{
    void drive(){
        System.out.println("Toyota is driving");
    }
}
class Motorcycle extends Vehicle{
    void ride(){
System.out.println("Motorcycle is riding");
    }
}
class Hyundai extends Motorcycle{
    void ride(){
        System.out.println("Hyundai is riding");
    }
}

public class BusparkEngine {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        //car.ride(); -->Not accessible
        car.stopEngine();
        Motorcycle bike=new Motorcycle();
        bike.startEngine();
        bike.ride();
        //bike.drive(); -->Not accessible
        bike.stopEngine();


        Toyota toyota = new Toyota();
        toyota.startEngine();
        toyota.drive();
        toyota.stopEngine();

        Hyundai honda =new Hyundai();
        honda.startEngine();
        honda.ride();
        honda.stopEngine();
    }
}
