import java.util.Scanner;

public class NumberSignChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");

        // Check if the input is actually a valid integer before reading it
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Positive");
            } else if (number < 0) {
                System.out.println("Negative");
            } else {
                System.out.println("Zero");
            }
        } else {
           
            System.out.println("Error: Please enter a valid whole number (integer).");
        }

        scanner.close();
    }
}