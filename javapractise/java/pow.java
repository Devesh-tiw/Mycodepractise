
import java.util.*;
public class pow{

    public static void main(String[]args) {
   Scanner sc =new Scanner (System.in);
   System.out.println("Enter the value of n :");
   double n=sc.nextInt();
   double x=2;
        double power = n;  
        if (power < 0) {
            x = 1 / x;    
            power = -power;
        }

        double result = 1;

        while (power > 0) {
            result *= x;
            power--;
        }

        System.out.println(result);
    }
}
