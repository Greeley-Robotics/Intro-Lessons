// Week 1 - Calculator Challenge Solution

// Importing the Scanner class for user input
import java.util.Scanner;

// Defining the class SimpleCalculator
public class CalculatorChallenge {

    // The main method, the entry point of the program
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Simple Calculator Program");

        // Creating a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking user input for the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Taking user input for the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Displaying the menu for operation selection
        displayMenu();

        // Taking user input for the operation choice
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        // Performing the selected operation and storing the result
        double result = performOperation(num1, num2, choice);

        // Displaying the result
        System.out.println("Result: " + result);

        // Closing the Scanner to prevent resource leak
        scanner.close();
    }

    // Method to display the operation menu
    static void displayMenu() {
        System.out.println("Select an operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
    }

    // Method to perform the selected operation
    static double performOperation(double num1, double num2, int choice) {
        // Switch statement to determine the operation based on user choice
        switch (choice) {
            case 1:
                // If choice is 1, perform addition
                return add(num1, num2);
            case 2:
                // If choice is 2, perform subtraction
                return subtract(num1, num2);
            case 3:
                // If choice is 3, perform multiplication
                return multiply(num1, num2);
            case 4:
                // If choice is 4, perform division
                return divide(num1, num2);
            default:
                // If choice is invalid, display an error message
                System.out.println("Invalid choice");
                // Return 0 as a default value
                return 0.0;
        }
    }

    // Method for addition
    static double add(double num1, double num2) {
        // Return the sum of num1 and num2
        return num1 + num2;
    }

    // Method for subtraction
    static double subtract(double num1, double num2) {
        // Return the difference between num1 and num2
        return num1 - num2;
    }

    // Method for multiplication
    static double multiply(double num1, double num2) {
        // Return the product of num1 and num2
        return num1 * num2;
    }

    // Method for division
    static double divide(double num1, double num2) {
        // Check if num2 is not zero to avoid division by zero
        if (num2 != 0) {
            // Return the result of dividing num1 by num2
            return num1 / num2;
        } else {
            // If num2 is zero, display an error message
            System.out.println("Cannot divide by zero");
            // Return 0 as a default value
            return 0.0;
        }
    }
}
