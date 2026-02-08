
public class BitWiseorperators {

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        System.out.println("--- Initial Values ---");
        System.out.println("a = " + a + " (" + Integer.toBinaryString(a) + ")");
        System.out.println("b = " + b + " (" + Integer.toBinaryString(b) + ")");
        System.out.println("\n--- Bitwise Logic ---");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a    = " + (~a));
 
        System.out.println("\n--- Bitwise Shifts ---");
    
        System.out.println("a << 1 = " + (a << 1));
        int c = 20;
        System.out.println("20 >> 1 = " + (c >> 1));
        int d = -20;
        System.out.println("-20 >> 1  = " + (d >> 1) + " (Preserves sign)");
        System.out.println("-20 >>> 1 = " + (d >>> 1) + " (Ignores sign, becomes huge positive)");
    }
}
