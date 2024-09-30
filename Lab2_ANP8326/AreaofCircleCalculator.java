import java.util.Scanner;
public class AreaofCircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);
        
        // Infinite loop to keep the program running until the user decides to exit
        while (true) {
            System.out.print("Enter 'yes' to find the area of a circle (or 'no' to exit): ");
            // Read user input and convert to lowercase
            String userInput = scanner.nextLine().trim().toLowerCase(); 
            
            // Check if the user wants to exit the program
            if (userInput.equals("no")) {
                System.out.println("Exiting the program.");
                // Exit the loop and end the program
                break; 
            }
            else if (userInput.equals("yes")) {
                try {
                    // Allow the user to enter the radius of the circle
                    System.out.print("Enter the radius of the circle: ");
                    // Read and parse the radius input
                    double radius = Double.parseDouble(scanner.nextLine().trim());
                    // Calculate the area of the circle 
                    double area = calculateCircleArea(radius); 
                    // Print the calculated area
                    System.out.printf("The area of the circle with radius %.2f is: %.2f%n", radius, area);
                } catch (NumberFormatException e) {
                    // Handle invalid input for the radius
                    System.out.println("Invalid input. Please enter a valid number for the radius.");
                }
            }
            else {
                // Handle invalid input for the initial prompt
                System.out.println("Invalid input. Please enter 'yes' or 'no'.");
            }
        }
        
        scanner.close(); // Close the scanner object
    }

    // Method to calculate the area of a circle given its radius
    public static double calculateCircleArea(double radius) {
        // Area formula: πr²
        return Math.PI * radius * radius; 
    }
}