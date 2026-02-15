public class selectionsort{
public static void main(String[]args){
int nums[]={7,8,3,1,2};
int small=0;
for(int j=0; j<nums.length-1;j++){
small=j;
for(int i=j+1;i<nums.length-1;i++){
    if(nums[small]<nums[i]){
    small = i;}

int temp=nums[small];
 nums[small]=nums[j];
 nums[j]=temp;
}
}
for(int i=0;i<nums.length;i++)
System.out.print(nums[i]);

}

}