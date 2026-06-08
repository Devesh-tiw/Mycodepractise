public class SwapNumbers {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        
        System.out.println("Before Swapping: a = " + a + ", b = " + b);
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After Swapping:  a = " + a + ", b = " + b);
    }
}
