public class insertionsort{
    public static void main(String[]args){
       int  nums[]={7,8,3,1,2};
       
       for(int j=1;j<nums.length;j++){
        int small=nums[j];
           int i = j - 1;
           while(i>=0 && small<nums[i]){
            nums[i+1]=nums[i];
            i--;
           }
            nums[i + 1]=small;
       }
    for (int j = 0; j < nums.length ; j++)
     System.out.print(nums[j]);
    }
}