// Week 2 - Programming Basics in Java

public class Functions {

    public static void main(String[] args) {
        // Welcome to Week 2!
        System.out.println("Hello, Week 2!");

        // Example 1: Simple Method Call
        greet(); // Calling the greet() method

        // Example 2: Method with Parameters
        String personName = "Alice";
        greetPerson(personName); // Calling the greetPerson() method with a parameter

        // Example 3: Method with Return Value
        int sumResult = addNumbers(5, 3); // Calling the addNumbers() method with parameters and storing the result
        System.out.println("Sum Result: " + sumResult);

        // Example 4: Method with Multiple Parameters and Return Value
        double productResult = multiplyNumbers(2.5, 4.0); // Calling the multiplyNumbers() method with parameters
        System.out.println("Product Result: " + productResult);
    }

    // Example 1: Simple Method
    static void greet() {
        System.out.println("Hello, there!");
    }

    // Example 2: Method with Parameters
    static void greetPerson(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Example 3: Method with Return Value
    static int addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    // Example 4: Method with Multiple Parameters and Return Value
    static double multiplyNumbers(double num1, double num2) {
        return num1 * num2;
    }
}

