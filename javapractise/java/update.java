
import java.util.*;

public class update {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        int n = 5;
        int pos = 1;
        int bitmask = 1 << pos;
        if(operation==1){
          
            int numnew = bitmask | n;
            System.out.println(numnew);
        }
     
         else{
            int newBitMask= ~(bitmask);
            int numnew = newBitMask & n;
            System.out.println(numnew);

         }

    }
}
