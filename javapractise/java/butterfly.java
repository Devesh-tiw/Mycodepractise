
import java.util.*;

public class butterfly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int k = 1; k <=2*(n-i); k++) {
                System.out.print("  ");
            }
           
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
        for (int i = n; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            for (int k = 1; k <=2* (n - i); k++) {
                System.out.print("  ");
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(" *");
            }
            System.out.print("\n");
        }
    }
}
