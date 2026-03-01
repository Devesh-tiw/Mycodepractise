
import java.util.*;

public class consecutivepyramide{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the value of n :");
        n = sc.nextInt();
        for (int j = 0; j <=n; j++) {
            for (int i = 1; i <=n-j; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k <j; k++) {
              
                    System.out.print(" "+j); 
            }
            
            System.out.print("\n ");
        }
    }
}
