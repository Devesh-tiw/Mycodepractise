import java.util.*;
public class arrays{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        int n;
        System.out.println("Enter the value size of Array:");
        n=sc.nextInt();
        int array[]=new int[50];
        int rev[]=new int[20];
        System.out.println("Enter the value of Array:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
            rev[n-i-1]=array[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(rev[i]+" ");
        }
         int flag = 1;
        for(int i=0;i<n;i++){
         if (rev[i]!=array[i]){
           flag=0;
           break;

         }}
         if (flag==1) {
            System.out.print("It is palindrome ");
     
        }
         else{
            System.out.print("This is not palinindrome");
         }
        

    }
}