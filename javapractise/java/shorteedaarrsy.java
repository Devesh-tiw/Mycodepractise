import java.util.*;

public class shorteedaarrsy{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
       System.out.print("Enter the value of Element size :");
       int n=sc.nextInt();
       int arr[]=new int[n];
       System.out.print("Enter the value of array:");
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        boolean isassending=true;
        for (int i = 0; i < n-1; i++) {
         if(arr[i]>arr[i+1]){
             isassending=false;
         }
        }
        if(isassending){
            System.out.println("Our array is shorted in assending order ");
        }
        else{
            System.out.println("Our array is not shorted in assending order");
        }
    }
}