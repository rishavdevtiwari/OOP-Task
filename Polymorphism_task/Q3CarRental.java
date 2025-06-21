// 3. You are developing a car rental system. 
// There are different types of vehicles available 
// for rent, 
// such as cars, motorcycles, and bicycles. 
// Each vehicle type has different rental calculation rules. 
// Implement a Java program using polymorphism to calculate the rental cost for different vehicle types.

abstract class Vehicle {
    protected double baseRate;
    protected int rentalDays;
    
    Vehicle(int rentalDays) {
        this.rentalDays = rentalDays;
    }
    
    abstract double calculateRentalCost();
}

class Car extends Vehicle {
    Car(int rentalDays) {
        super(rentalDays);
        this.baseRate = 50.0;
    }
    
    @Override
    double calculateRentalCost() {
        return baseRate * rentalDays;
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(int rentalDays) {
        super(rentalDays);
        this.baseRate = 30.0;
    }
    
    @Override
    double calculateRentalCost() {
        return baseRate * rentalDays * 0.9; // 10% discount
    }
}

class Bicycle extends Vehicle {
    Bicycle(int rentalDays) {
        super(rentalDays);
        this.baseRate = 15.0;
    }
    
    @Override
    double calculateRentalCost() {
        if (rentalDays > 7) {
            return baseRate * 7 + (rentalDays - 7) * baseRate * 0.5; // 50% discount after 7 days
        }
        return baseRate * rentalDays;
    }
}

public class Q3CarRental {
    public static void main(String[] args) {
        Vehicle[] vehicles = {
            new Car(5),
            new Motorcycle(3),
            new Bicycle(10)
        };
        
        for (Vehicle vehicle : vehicles) {
            System.out.println("Rental cost: $" + vehicle.calculateRentalCost());
        }
    }
}