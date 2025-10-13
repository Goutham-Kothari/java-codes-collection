import java.util.Scanner;

public class OperatorsDemo {
    public static void main(String[] args) {
        // --- ABOUT OPERATOR ---
        // Operator → Symbol that performs an operation on operands.
        // Operand → Variable/value on which the operator works.
        // Expression → Combination of operands and operators that produces a result.
        // Example: c = a + b;   → '+' is operator, a & b are operands, 'a + b' is expression.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int a = sc.nextInt();

        System.out.println("Enter swcond number: ");
        int b = sc.nextInt();

        // ARITHMETIC OPERATORS
        System.out.println("\n--- Arithmetic Operators ---");
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus (Remainder)

        // UNARY OPERATORS
        System.out.println("\n--- Unary Operators ---");
        System.out.println("++a = " + (++a));   // Pre-increment
        System.out.println("--b = " + (--b));   // Pre-decrement
        System.out.println("a++ = " + (a++));   // Post-increment
        System.out.println("b-- = " + (b--));   // Post-decrement
        System.out.println("After post operations: a = " + a + ", b = " + b);
        System.out.println("Unary minus (-a) = " + (-a));

        // RELATIONAL OPERATORS
        System.out.println("\n--- Relational Operators ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= b : " + (a >= b));
        System.out.println("a <= b : " + (a <= b));

        // LOGICAL OPERATORS
        System.out.println("\n--- Logical Operators ---");
        boolean x = true;
        boolean y = false;
        System.out.println("x && y : " + (x && y)); // AND
        System.out.println("x || y : " + (x || y)); // OR
        System.out.println("!x     : " + (!x));     // NOT

        // ASSIGNMENT OPERATORS
        System.out.println("\n--- Assignment Operators ---");
        int c = a;
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 → " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 → " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 → " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 → " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3 → " + c);

        sc.close();
    }
}