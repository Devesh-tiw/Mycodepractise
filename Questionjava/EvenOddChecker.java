import java.util.Scanner;

public class EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        // Check if the next input is actually an integer
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number % 2 == 0) {
                System.out.println(number + " is even.");
            } else {
                System.out.println(number + " is odd.");
            }
        } else {
            System.out.println("Error: That is not a valid whole number!");
        }

        scanner.close();
    }
}
