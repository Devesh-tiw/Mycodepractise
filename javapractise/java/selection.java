

public class selection {

    public static void main(String[] args) {
        int nums[] = {7, 8, 3, 1, 2};
        int j, temp;      
   
        for (j = 0; j < nums.length-1; j++) {
            int small = j;
            for (int i = j+1; i < nums.length; i++) {
                if (nums[small]>nums[i]) {
                   small=i;

                }
              
            }
            temp = nums[small];
            nums[small] = nums[j];
            nums[j ] = temp;

        }
        for (j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
    }
}
