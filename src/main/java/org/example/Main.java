package org.example;

import java.util.Scanner;

public class Main {

    /**
     * Main method of the program that performs one arithmetic operation.
     *
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input operation
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.next();

        // Input second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform operation and display result
        performOperation(num1, num2, operation);

        scanner.close();
    }

    /**
     * Performs arithmetic operation on two numbers and displays the result.
     * Result is rounded to 4 decimal places.
     *
     * @param num1 the first number
     * @param num2 the second number
     * @param operation the arithmetic operation (+, -, *, /)
     */
    public static void performOperation(double num1, double num2, String operation) {
        double result;
        boolean validOperation = true;

        switch (operation) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0) {
                    System.err.println("Error: Division by zero is not allowed!");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                System.err.println("Error: Unsupported operation: " + operation);
                validOperation = false;
                result = 0;
        }

        if (validOperation) {
            System.out.printf("Result: %.4f", result);
        }
    }
}