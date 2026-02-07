
import java.util.*;

public class searching {

    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n, x;
         System.out.println("Enter the value size of Array:");
         n = sc.nextInt();
         int array[] = new int[50];
         System.out.println("Enter the value of Array:");
         for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
         }
         System.out.println("Enter the searching value:");
         x = sc.nextInt();
         for (int i = 0; i < array.length; i++){ 
            if (x == array[i]){ 
                System.out.print("The number is in the array "+ (i+1));
                break;
            }
        }
        
    }
}
