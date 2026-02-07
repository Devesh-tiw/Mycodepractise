import java.util.*;
public class pyramid{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the value of N :");
        n = sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(j);}
            System.out.print("\n");
        }

    }
}