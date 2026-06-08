public class SI {
    public static void main(String[] args) {

        double principal = 5000.0;
        double rate = 6.5;
        double time = 3.0;

        double simpleInterest = (principal * rate * time) / 100;

        System.out.println("Principal Amount: " + principal);
        System.out.println("Interest Rate: " + rate + "%");
        System.out.println("Time Period: " + time + " years");
        System.out.println("Calculated Simple Interest: " + simpleInterest);
    }

}
