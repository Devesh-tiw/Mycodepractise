
import java.util.Scanner;

public class maxmat {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        System.out.println("Enter the value size of Array:");
        n = sc.nextInt();
        int array[] = new int[50];
        System.out.println("Enter the value of Array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
    int big=array[0];
    int small=array[0];
        for (int i = 0; i < n; i++) {
           if(array[i]>big){
            big=array[i];
           } 
        }
        for (int i = 0; i < n; i++) {
            if (array[i] < small) {
                small=array[i];
            }
        }
        System.out.println("the biggest element is :"+big);
        System.out.println("the smallest element is " + small);
}
}
