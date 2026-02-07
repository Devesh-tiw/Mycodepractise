import java.util.*;
public class Arev{
     public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
         int n,i,temp;
         System.out.println("Enter the value size of Array:");
         n = sc.nextInt();
         int arr[] = new int[50];
         
         System.out.println("Enter the value of Array:");
         for ( i = 0; i < n; i++) {
             arr[i] = sc.nextInt();
             }
            
         for (i=0;i<n-1;i++) {
                  int small = i;
             for(int j=i+1;j<n;j++)  
                 if(arr[j]<arr[small])
                      small=j; 
             if(small != i)  {
                 temp = arr[i];
                 arr[i] = arr[small];
                 arr[small] = temp;
             }
         }    
         System.out.println("The sorted array is:");
         for (i = 0; i < n; i++)
         System.out.println(arr[i]);
    }
}