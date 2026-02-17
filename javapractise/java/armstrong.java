
public class armstrong {

    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;
        int remainder, result = 0;
        int digits = 0;
        while (originalNum != 0) {
            originalNum /= 10;
            digits++;
        }

        originalNum = num;

      
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, digits);
            originalNum /= 10;
        }

        // Step 3: Check
        if (result == num) {
            System.out.println(num + " is an Armstrong number."); 
        }else {
            System.out.println(num + " is not an Armstrong number.");
        }
    }
}
