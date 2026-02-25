public class intrction{
    public static void main(String []args){
        int nums1[]={ 1,2,2,1};
        int nums2[]={ 2, 2};
        int src[]=new int [10];
        for (int j = 0; j < nums2.length - 1; j++) {
        for(int i=0;i<nums1.length-1;i++){ 
                    if(nums2[j]!=nums1[i]){
                        src[j]=nums2[j];
                    }}}
                    for (int j = 0; j < nums2.length - 1; j++)
                    System.out.println(src[j]);

    }
}