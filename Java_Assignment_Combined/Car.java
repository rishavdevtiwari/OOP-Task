public class Car {
    private final String make;
    private final String model;
    private double rentalPricePerDay;
    private boolean isAvailable;

    public Car(String make, String model, double rentalPricePerDay) {
        this.make = make;
        this.model = model;
        setRentalPricePerDay(rentalPricePerDay);
        this.isAvailable = true;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getRentalPricePerDay() {
        return rentalPricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setRentalPricePerDay(double rentalPricePerDay) {
        if (rentalPricePerDay > 0) {
            this.rentalPricePerDay = rentalPricePerDay;
        } else {
            System.out.println("Rental price must be positive. Setting to default 50.");
            this.rentalPricePerDay = 50;
        }
    }

    public boolean rentCar() {
        if (isAvailable) {
            isAvailable = false;
            return true;
        }
        return false;
    }

    public void returnCar() {
        isAvailable = true;
    }
}