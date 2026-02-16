public class selec{
    public static void main(String[]args){
        int nums[]={7,8,3,1,2,4};
        for (int j=0;j<3-1;j++){
            int small=j;
            for(int i=j+1;i<3;i++){
                if(nums[small]>nums[i]){
                    small=i;
                } }
                int temp = nums[small];
                nums[small]=nums[j];
                nums[j]=temp;
        }
           
            for (int j = 3; j < nums.length-1; j++) {
                int large = j;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[large] < nums[i]) {
                large = i;
            }
        }
        int temp1 = nums[large];
        nums[large] = nums[j];
        nums[j] = temp1;
    
        }
        for (int i =0; i < nums.length; i++)
        System.out.println(nums[i]);
    }
}