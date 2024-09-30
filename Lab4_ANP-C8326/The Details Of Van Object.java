// Class representing a vehicle with brand and model
class Vehicle {
    String brand;
    String model;

    // Constructor to initialize brand and model
    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Getter for brand
    public String getBrand() {
        return brand;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    //  toString method to return brand and model information
    public String toString() {
        return "Brand: " + brand + ", Model: " + model;
    }
}

// Class representing the speed of a vehicle
class Speed {
    int maxSpeed;

    // Constructor to initialize maxSpeed
    public Speed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    // Getter for maxSpeed
    public int getMaxSpeed() {
        return maxSpeed;
    }

    // toString method to return maxSpeed information
    public String toString() {
        return "Max Speed: " + maxSpeed + " km/h";
    }
}

// Class representing a Van which is a type of Vehicle
class Van extends Vehicle {
    Speed speed;

    // Constructor to initialize brand, model, and speed
    public Van(String brand, String model, Speed speed) {
        super(brand, model);
        this.speed = speed;
    }

    // toString method to include speed information
    public String toString() {
        return super.toString() + ", " + speed.toString();
    }
}

// Test class to run the program
public class SpeedTest {
    public static void main(String[] args) {
        // Creating a Speed object with a maximum speed
        Speed speed = new Speed(150);

        // Creating a Van object
        Van van = new Van("Toyota", "Hiace", speed);

        // Printing the  Van object
        System.out.println(van);
    }
}