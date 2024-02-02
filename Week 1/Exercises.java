// Week 1 - Exercises

public class Exercises {

    public static void main(String[] args) {
        // Exercise 1: Simple Arithmetic
        // Perform basic arithmetic operations and print the results.
        int num1 = 10;
        int num2 = 5;

        System.out.println("Exercise 1: Simple Arithmetic");
        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        System.out.println("Quotient: " + (num1 / num2));
        System.out.println();

        // Exercise 2: Temperature Conversion
        // Convert Celsius to Fahrenheit using the formula: F = (C * 9/5) + 32.
        double celsius = 20.0;

        System.out.println("Exercise 2: Temperature Conversion");
        System.out.println("Celsius: " + celsius);
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Fahrenheit: " + fahrenheit);
        System.out.println();

        // Exercise 3: String Manipulation
        // Concatenate and manipulate strings.
        String firstName = "John";
        String lastName = "Doe";

        System.out.println("Exercise 3: String Manipulation");
        System.out.println("Full Name: " + firstName + " " + lastName);
        System.out.println("Initials: " + firstName.charAt(0) + lastName.charAt(0));
        System.out.println();

        // Exercise 4: Boolean Logic
        // Use boolean variables to perform logical operations.
        boolean isSunny = true;
        boolean isRainy = false;

        System.out.println("Exercise 4: Boolean Logic");
        System.out.println("Is it a sunny day? " + isSunny);
        System.out.println("Is it a rainy day? " + isRainy);
        System.out.println("Should I bring an umbrella? " + (isSunny || isRainy));
        System.out.println();

        // Additional Challenges:
        // - Write a program to find the area of a rectangle.
        // - Implement a simple calculator that can perform addition, subtraction, multiplication, and division.
        // - Create a program to check if a number is even or odd.

        // Feel free to experiment and modify these exercises to reinforce your understanding of Java concepts!
    }
}
