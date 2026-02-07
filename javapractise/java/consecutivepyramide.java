
import java.util.*;

public class consecutivepyramide{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <i; k++) {
              
                    System.out.print(" "+i); 
            }
            
            System.out.print("\n ");
        }
    }
}
