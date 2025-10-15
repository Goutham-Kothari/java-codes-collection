import java.util.Scanner;

class Hollow_Rombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row : ");
        int r = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            // space
            for (int k = 1; k <= (r-i); k++) {
                System.out.print("  ");
            }
            // star
            for (int j = 1; j <= r; j++) {
                if (i==1||i==r||j==1||j==r) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
