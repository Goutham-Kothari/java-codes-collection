import java.util.Scanner;

public class Square_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the size of the square: ");
        int n = sc.nextInt();

        // Printing the square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");  // You can change '*' to any symbol
            }
            System.out.println();  // Move to the next line
        }

        sc.close();
    }
}
