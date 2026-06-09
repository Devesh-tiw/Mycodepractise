import java.util.Scanner;

interface Payment {
    void pay(double amount);

    void refund(double amount);
}

class UPI implements Payment {
    String upiId;

    public UPI(String upiId) {
        this.upiId = upiId;
    }

    public void pay(double amount) {
        System.out.println("Processing UPI Payment of $" + amount + " via " + upiId);
    }

    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to UPI ID: " + upiId);
    }
}

class CreditCard implements Payment {
    String cardNumber;
    
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Processing Credit Card Payment of $" + amount + " using card ending in "+ cardNumber.substring(cardNumber.length() - 4));
    }

    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to Credit Card.");
    }
}

class NetBanking implements Payment {
    String bankName;

    public NetBanking(String bankName) {
        this.bankName = bankName;
    }

    public void pay(double amount) {
        System.out.println("Processing Net Banking Payment of $" + amount + " through " + bankName);
    }

    public void refund(double amount) {
        System.out.println("Refunding $" + amount + " to " + bankName + " account.");
    }
}

public class OnlinePaymentGateway {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter UPI ID: ");
        String upiId = scanner.nextLine();
        Payment upiPayment = new UPI(upiId);

        System.out.print("Enter 16-digit Credit Card Number: ");
        String cardNum = scanner.nextLine();
        Payment cardPayment = new CreditCard(cardNum);

        System.out.print("Enter Bank Name for Net Banking: ");
        String bank = scanner.nextLine();
        Payment netPayment = new NetBanking(bank);

        System.out.print("\nEnter transaction amount: $");
        double amount = scanner.nextDouble();

        System.out.println("\n--- Initiating Payments ---");
        upiPayment.pay(amount);
        cardPayment.pay(amount);
        netPayment.pay(amount);

        System.out.println("\n--- Initiating Refunds ---");
        upiPayment.refund(amount);
        cardPayment.refund(amount);
        netPayment.refund(amount);

        scanner.close();
    }
}
