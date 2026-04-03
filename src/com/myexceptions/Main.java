/**
 *  Java program to demonstrate ArithmeticException because of dividing by 0.
 */

package com.myexceptions;

/**
 *  Main class.
 */
public class Main {

    // Java entry point.
    public static void main(String[] args) {

        // Creating a number.
        int number = 5;

        // Creating a numerator.
        int numerator = 25;

        // Iterating through numbers from 5 to 0 and divide by it a numerator.
        for (int index = number; index >= 0; index--) {

            int result = numerator / index;

            // Printing the result to console.
            System.out.format("Result of %d / %d is %d", numerator, index, result);

            // Next line.
            System.out.println();

        }   // Output: Result of 25 / 5 is 5
            // Result of 25 / 4 is 6
            // Result of 25 / 3 is 8
            // Result of 25 / 2 is 12
            // Result of 25 / 1 is 25
            // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}