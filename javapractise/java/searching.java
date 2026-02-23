

public class searching {

    public static void main(String args[]) {
        int nums[]={1,3,5,6};
        int digit = 0;
        int target=5;
        int n = nums.length;
        int X = nums[n-1];
      
        for (int i = 0; i < n; i++) {
            if (target <= nums[i]) {
                digit=i;
                break;
            }

        }
        if (target > X) {
            System.out.println(n);
        }
        System.out.println(digit);
        
    }
}
