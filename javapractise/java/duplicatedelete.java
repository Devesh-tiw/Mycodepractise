
public class duplicatedelete {

    public static void main(String[] args) {
        int nums[] = {2, 3, 3, 5, 5};
        
     
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] !=nums[i-1]) {
                nums[k] = nums[i];
                k++;}
            
        }
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i]);
        }
    }
}
