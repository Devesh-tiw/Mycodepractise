import java.util.Scanner;
public class bubbleselection{
    
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in );
    int arr[]=new int[20];
    int j,n,temp;
    System.out.println("Enter the value of n :");
    n=sc.nextInt();
    System.out.println("Enter the value of array:");
    for(int i=0;i<n;i++){ 
    arr[i]=sc.nextInt();}
    for (j = 0; j < n  - 1; j++){
        for (int i = 0; i < n -j- 1; i++) {
            if (arr[i]>arr[i+1]){
                temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;

            }
        }
       
    }
    for (j = 0; j < n ; j++)
   System.out.print(arr[j]);
}}
