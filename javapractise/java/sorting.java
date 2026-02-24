// public class sorting{
//     public static void main(String []args){
//         int nums[]={7,8,3,1,2};
//         for (int j = 0; j < nums.length-1; j++) {
//         for(int i=0;i<nums.length-1;i++){
           
//                if(nums[i]>nums[i+1]){
//                 int temp=nums[i];
//                  nums[i]=nums[i+1];
//                  nums[i+1]=temp;
//                }
//             }
//         }
//         for(int i=0;i<nums.length;i++)
//         System.out.println(nums[i]);
//     }
// }
public class sorting{
    public static void main(String []args){
        int nums[]={7,1,8,3,2};
        for (int j = 0; j < nums.length; j++) {
            int small=j;
        for(int i=j+1;i<nums.length;i++){
           if(nums[small]>nums[i])
               small=i;
               }
               
                int temp = nums[small];
                nums[small] = nums[j];
                nums[j] = temp;
           
        }
        for(int i=0;i<nums.length;i++)
        System.out.println(nums[i]);
    }
}
