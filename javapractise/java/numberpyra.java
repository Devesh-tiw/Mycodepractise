
import java.util.*;
public class numberpyra {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of N :");
        n = sc.nextInt();
        int number=1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0)
                System.out.print("1");
               else{
                System.out.print("0");
               }
            }
            System.out.print("\n");
        }

    }
}
