public class arraysorted{
    public static boolean increasing(int arr[],int base){
        if(base==arr.length-1){
           
            return true;
        }
        if(arr[base]<arr[base+1]){
          return  increasing(arr,base+1);
        }
        else{
            return false;
        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        System.out.println(increasing(arr,0));
    }
}