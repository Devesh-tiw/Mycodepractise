
import java.util.*;

public class clear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=5;
        
       int  pos = 2;
        int bitmask = 1 << pos;
       int  newbitmask= ~(bitmask);
        int namenew = newbitmask & n;
        
        System.out.println(namenew);

    }
}
