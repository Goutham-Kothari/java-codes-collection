import java.util.Scanner;

class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value for row :");
        int r = sc.nextInt();
        System.out.print("Enter the value for column :");
        int c = sc.nextInt();

        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i == 1 || j == 1 || i == r || j == c) {
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