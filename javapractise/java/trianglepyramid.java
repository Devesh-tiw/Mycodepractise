
import java.util.*;

public class trianglepyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        System.out.println("Enter the number of positive integer :");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <=i; k++) {
                System.out.print(" *");
            }
            

            System.out.print("\n");
        }

    }
}
