
import java.util.Scanner;
public class boypattern{
    

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size (recommended 3 to 7): ");
            int n = sc.nextInt();

            // Head
            for (int i = 0; i < n / 2; i++) {
                System.out.print(" ");
            }
            System.out.println("O");

            // Arms and body
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("/|\\");
            }

            // Legs
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n / 2 - 1; j++) {
                    System.out.print(" ");
                }
                System.out.println("/ \\");
            }
        }
    }
