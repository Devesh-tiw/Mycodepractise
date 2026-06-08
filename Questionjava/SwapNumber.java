import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping with temp: a = " + a + ", b = " + b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping without temp: a = " + a + ", b = " + b);

        scanner.close();
    }
}
