import java.util.Scanner;

class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row : ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // space
            for (int j = 1; j <= (r - i); j++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= ((2*i)-1); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
      
        sc.close();
    }
}
