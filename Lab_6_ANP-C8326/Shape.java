// Define the Resizable interface
interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

// Implement the Rectangle class that implements the Resizable interface
class Rectangle implements Resizable {
    private int width;
    private int height;

    // Constructor to initialize the rectangle dimensions
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Implement the resizeWidth method from the Resizable interface
      public void resizeWidth(int width) {
        this.width = width;
        System.out.println("Width resized to: " + this.width);
    }

    // Implement the resizeHeight method from the Resizable interface
  
    public void resizeHeight(int height) {
        this.height = height;
        System.out.println("Height resized to: " + this.height);
    }

    // Method to display the dimensions of the rectangle
    public void displayDimensions() {
        System.out.println("Rectangle dimensions - Width: " + this.width + ", Height: " + this.height);
    }
}

// Main class to test the functionality
public class Shape {
    public static void main(String[] args) {
        // Create a new Rectangle object with initial dimensions
        Rectangle rect = new Rectangle(10, 20);

        // Display the initial dimensions of the rectangle
        rect.displayDimensions();

        // Resize the width and height of the rectangle
        rect.resizeWidth(40);
        rect.resizeHeight(60);

        // Display the updated dimensions of the rectangle
        rect.displayDimensions();
    }
}