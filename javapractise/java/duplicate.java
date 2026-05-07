public class duplicate {
    public static void main(String[]args){
     int []arr = {1,2,3,4};
     int flag=0;
     for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length;j++){
            if(arr[i]==arr[j]&& i!=j){
                flag=1;
            }
        }
     }
     
     
     if(flag==1){
System.out.println("Duplicate is here");
     }
     else{
        System.out.println("not here");
     }

     }

    }

