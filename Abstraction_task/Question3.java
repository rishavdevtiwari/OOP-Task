//3. Create an abstract class called Vehicle 
//with abstract methods startEngine() and stopEngine(). 
//Implement two subclasses called Car and Motorcycle that inherit from Vehicle. 
//Implement the startEngine() and stopEngine() methods in both subclasses 
//to start and stop the engines of a car and a motorcycle, respectively. 

abstract class Vehicle {
    public abstract void startEngine();
    public abstract void stopEngine();
}

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started with a key turn.");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped by turning key back.");
    }
}

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started with a kick start.");
    }
    
    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped by turning off ignition.");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        car.startEngine();
        car.stopEngine();
        
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}