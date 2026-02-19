
import java.util.*;

public class recusion {

    public static void pnum(int nums) {
        if (nums == 0) {
            return;
        }
        pnum(nums - 1);

        System.out.println(nums);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n :");
        int nums = sc.nextInt();
        pnum(nums);

    }
}
