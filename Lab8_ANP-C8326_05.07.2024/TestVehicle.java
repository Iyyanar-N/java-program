// Base class
abstract class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    public Vehicle(String make, String model, int year, String fuelType) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelType = fuelType;
    }
     public String getMake() {
        return make;
    }
     public String getModel() {
        return model;
    }
     public int getYear() {
        return year;
    }
     public String getFuelType() {
        return fuelType;
    }
    // Abstract methods to be implemented by subclasses
    public abstract double calculateFuelEfficiency();
    public abstract double distanceTraveled(double fuelConsumed);
    public abstract double maximumSpeed();
}
// Truck subclass
class Truck extends Vehicle {
    public Truck(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        // Example calculation
        return 10.0; // miles per gallon
    }
    public double distanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }
    public double maximumSpeed() {
        return 120.0; // miles per hour
    }
}
// Car subclass
class Car extends Vehicle {
    public Car(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        // Example calculation
        return 25.0; // miles per gallon
    }
    public double distanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }
    public double maximumSpeed() {
        return 150.0; // miles per hour
    }
}
// Motorcycle subclass
class Motorcycle extends Vehicle {
    public Motorcycle(String make, String model, int year, String fuelType) {
        super(make, model, year, fuelType);
    }
    public double calculateFuelEfficiency() {
        // Example calculation
        return 40.0; // miles per gallon
    }
    public double distanceTraveled(double fuelConsumed) {
        return fuelConsumed * calculateFuelEfficiency();
    }
    public double maximumSpeed() {
        return 180.0; // miles per hour
    }
}
// Main class to test the hierarchy
public class TestVehicle {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2022, "Diesel");
        Vehicle car = new Car("Toyota", "Camry", 2022, "Gasoline");
        Vehicle motorcycle = new Motorcycle("Harley-Davidson", "Sportster", 2022, "Gasoline");

        System.out.println("Truck make: " + truck.getMake());
        System.out.println("Truck fuel efficiency: " + truck.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Truck distance traveled with 10 gallons: " + truck.distanceTraveled(10) + " miles");
        System.out.println("Truck maximum speed: " + truck.maximumSpeed() + " mph");

        System.out.println("\nCar make: " + car.getMake());
        System.out.println("Car fuel efficiency: " + car.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Car distance traveled with 10 gallons: " + car.distanceTraveled(10) + " miles");
        System.out.println("Car maximum speed: " + car.maximumSpeed() + " mph");

        System.out.println("\nMotorcycle make: " + motorcycle.getMake());
        System.out.println("Motorcycle fuel efficiency: " + motorcycle.calculateFuelEfficiency() + " miles per gallon");
        System.out.println("Motorcycle distance traveled with 10 gallons: " + motorcycle.distanceTraveled(10) + " miles");
        System.out.println("Motorcycle maximum speed: " + motorcycle.maximumSpeed() + " mph");
    }
}