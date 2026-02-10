import java.util.*;
public class deleting{
  
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
    int arr[]=new int[20];
    int pos=0;
    System.out.println("Enter the n :");
    int n=sc.nextInt();
    System.out.println("Enter the value of Array :");
    for(int i=0;i<n;i++){
    arr[i]=sc.nextInt();
        } 
        System.out.println("Enter the Element :");
        int ele= sc.nextInt();

        for(int i=0;i<n;i++){
            pos++;
            if(ele==arr[i]){
               
                break;
            }
        }
        for(int i=pos-1;i<n;i++){
          arr[i]=arr[i+1];
       
        }
        System.out.println("New Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");}
    }
}