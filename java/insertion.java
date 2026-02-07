
import java.util.*;

public class insertion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Element size :");
        int n = sc.nextInt();
        int arr[] = new int[20];
        System.out.print("Enter the value of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element which you want to insert:");
        int ele=sc.nextInt();
        System.out.println("Enter the position which you want to Insert:");
        int pos=sc.nextInt();
      n=n+1;//space builder
     for(int i=n-1;i>=pos-1;i--){
        arr[i]=arr[i-1];}
        arr[pos-1]=ele;
     System.out.println("New Array");
     for (int i=0; i <n; i++) {
         System.out.print(arr[i]+"  ");
     }
    }
}
