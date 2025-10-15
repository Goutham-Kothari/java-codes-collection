import java.util.Scanner;

class BasicJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of row :");
        int r = sc.nextInt();

        for (int i = 1; i <= r ; i++) {
            inner(r, i);
        }
        for (int i = r; i >= 1 ; i--) {
            inner(r, i);
        }

        sc.close();
    }
    public static void inner(int r,int n) {
        // i star
        for (int j = 1; j <= n; j++) {
                System.out.print("* ");
        }
        // 2 * (n - i) space
        for (int k = 1; k <= 2*(n-i); k++) {
            System.out.print("  ");
        }
        // i star
        for (int l = 1; l <= n; l++) {
            System.out.print("* ");
        }    
        System.out.println();
    }
}
