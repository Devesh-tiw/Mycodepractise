public class rotatearay{
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int n=nums.length;
        int k=3;
        int i=0;
        while(i<k){
            n++;
            nums[i] = nums[n-i-1];
         

            i++;
        }
        System.out.println(nums);
    }}

