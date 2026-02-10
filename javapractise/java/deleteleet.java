public class deleteleet {

    public static void main(String[] args) {
   int nums[]={2,3,3,4,5};
     int val=3;
       int pos=0;
       int k=0;
        for (int i = 0; i < nums.length; i++) {
               if (nums[i] != val) {
                nums[k] = nums[i]; 
                k++;
            }
        }
        for (int i = 0; i < nums.length; i++)
        System.out.print(nums[i]);
    }
}

