import java.util.*;
public class SecondBig{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]= new int[10];
        int n,big ,SecondBig;
        System.out.print("Enter the value of n:");
        n=sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){ 
        arr[i]=sc.nextInt();
        }
     SecondBig = big =Integer.MIN_VALUE;
     for (int i = 0; i < n; i++) {
            
     if (arr[i]>big){

     SecondBig = big;
     big=arr[i];
   
     }
     else if (arr[i] > SecondBig && arr[i] < big) {
                SecondBig = arr[i];
            }


        }
        System.out.println("The second Largest is:");
        System.out.println(SecondBig);
        
     }
}