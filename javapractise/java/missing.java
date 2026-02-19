
import java.util.*;

public class missing {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of n:");
        int n = sc.nextInt();

        int arr[] = new int[n];
        int sum = 0;

        
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int total = n * (n + 1) / 2;

        int missing = total - sum;

        System.out.println("Missing number is: " + missing);
    }
}
