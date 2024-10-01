// Define the superclass Shapes
class Shapes {
    // Method to calculate the area (abstract method to be overridden by subclasses)
    public double area() {
        return 0.0; // Default implementation
    }
}

// Subclass Triangle inheriting from Shapes
class Triangle extends Shapes {
    private double base;
    private double height;

    // Constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Override area method to calculate area of Triangle
  
    public double area() {
        return 0.5 * base * height; // Triangle area formula
    }
}

// Subclass Circle inheriting from Shapes
class Circle extends Shapes {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Override area method to calculate area of Circle
   
    public double area() {
        return Math.PI * radius * radius; // Circle area formula
    }
}

// Subclass Rectangle inheriting from Shapes
class Rectangle extends Shapes {
    private double width;
    private double height;

    // Constructor
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Override area method to calculate area of Rectangle
    
    public double area() {
        return width * height; // Rectangle area formula
    }
}

// Main class to test the functionality
public class Inherit {
    public static void main(String[] args) {
        // Create instances of different shapes
        Shapes shape1 = new Triangle(6, 4);
        Shapes shape2 = new Circle(2);
        Shapes shape3 = new Rectangle(5, 2.5);

        // Calculate and print areas using polymorphism
        System.out.println("Area of Triangle: " + shape1.area());
        System.out.println("Area of Circle: " + shape2.area());
        System.out.println("Area of Rectangle: " + shape3.area());
    }
}