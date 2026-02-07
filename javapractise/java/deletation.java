
import java.util.*;

public class deletation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of Element size :");
        int n = sc.nextInt();
        int arr[] = new int[20];
        System.out.print("Enter the value of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the position which you want to delete:");
        int pos = sc.nextInt();
        for (int i =pos-1; i<n; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.println("New Array");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
