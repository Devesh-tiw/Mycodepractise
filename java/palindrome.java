
import java.util.*;

public class palindrome {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of positive integer :");
        n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = i; k >=1; k--) {
                System.out.print(k);
            }
            for (int k = 1; k <i; k++) {
                System.out.print((k+1));
            }

            System.out.print("\n");
        }

    }
}
