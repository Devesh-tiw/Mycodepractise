import java.util.Scanner;

// Step 1: Create the User-Defined Exception Class
// Change "extends Exception" to "extends java.lang.Exception"
class InvalidAgeException extends java.lang.Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

// Main class to run the experiment
public class VotingEligibility {

    // Step 2: Create a method that checks age and throws the custom exception
    public static void checkEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            // Explicitly throw our custom exception if age is less than 18
            throw new InvalidAgeException("Age is less than 18. Not eligible to vote!");
        } else {
            System.out.println("Welcome! You are eligible to vote.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        // Step 3: Handle the custom exception using a try-catch block
        try {
            checkEligibility(userAge);
        } catch (InvalidAgeException e) {
            // Handle the custom exception here
            System.out.println("Caught Custom Exception: " + e.getMessage());
        } finally {
            sc.close(); // Close the scanner resource
            System.out.println("Execution completed.");
        }
    }
}