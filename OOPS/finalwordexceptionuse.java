public class finalwordexceptionuse {
    public static void main(String[] args) {

        String a = null;

        try {
            System.out.println(a.length());  // 
        } catch (NullPointerException e) {
            System.out.println("The Exception is handled: " + e);
        }
finally{ 
        System.out.println("Program continues");
        }
    }
}
