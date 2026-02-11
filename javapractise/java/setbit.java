
import java.util.*;

public class setbit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of n:");
        n = sc.nextInt();
        System.out.println("Enter the position:");
        int pos = sc.nextInt();
        int bitmask = 1 << pos;
        int namenew=bitmask | n;
        System.out.println(namenew);

    
    }
    }
