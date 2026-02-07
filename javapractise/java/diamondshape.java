
import java.util.*;

public class diamondshape {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the number of positive integer :");
        n = sc.nextInt();
        m = 2;
        for (int a = 0; a < m; a++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("  *");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }

                System.out.print("\n");
            }
            for (int i = n; i >= 0; i--) {
                for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print("*");
                }
                for (int j = 0; j <= i; j++) {
                    System.out.print("  *");
                }
                for (int k = 0; k < i; k++) {
                    System.out.print(" ");
                }

                System.out.print("\n");
            }
        }
    }
}
