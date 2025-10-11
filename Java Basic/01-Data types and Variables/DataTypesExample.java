/**
 * This program demonstrates:
 * 1. All basic Java data types
 * 2. Variable declaration and initialization
 * 3. System.out.print (sop) and System.out.println (sopln)
 * 4. Single-line, multi-line, and documentation comments
 * 5. Taking user input using Scanner class
 */

import java.util.*;

public class DataTypesExample {

    public static void main(String[] args) {

        // Creating a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // --- SINGLE-LINE COMMENT ---
        // Asking user for their name
        System.out.print("Enter your name : "); // single line output print
        String name = sc.nextLine();

        /* 
         * MULTI-LINE COMMENT
         * Asking user for their age and height.
         * Demonstrates int and double data types.
         */
        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        System.out.println("Enter your height (in meters): ");
        double height = sc.nextDouble();

        // Asking for one character input (like gender)
        System.out.print("Enter your gender (M/F): ");
        char gender = sc.next().charAt(0); // Takes the first character of the next user input word (since Scanner has no nextChar() method)


        // Asking for boolean input
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Byte, Short, and Long examples
        byte byteVal = 100; // small integer value
        short shortVal = 20000; // slightly larger integer
        long longVal = 12345678900L; // long integer, note the 'L'

        // Float example
        float weight = 68.5f; // note the 'f' at the end

        // --- OUTPUT SECTION ---
        System.out.println("\n--- USER DETAILS ---"); // next line used
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        System.out.println("Gender: " + gender);
        System.out.println("Is Student: " + isStudent);

        System.out.println("\n--- OTHER DATA TYPES ---");
        System.out.println("Byte Value: " + byteVal);
        System.out.println("Short Value: " + shortVal);
        System.out.println("Long Value: " + longVal);
        System.out.println("Float Value: " + weight);

        // Example of (without new line)
        System.out.print("\nThank you ");
        System.out.print(name);
        System.out.println(" for using this program!"); // with new line

        sc.close();
    }
}
