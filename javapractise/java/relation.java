
public class relation {

    public static void main(String[] args) {
        int passwordLength = 6;
        int requiredLength = 8;
        int userAge = 17;

        if (passwordLength >= requiredLength) {
            System.out.println("Password accepted.");
        } else {
            System.out.println("Password too short.");
        }
        if (userAge == 18) {
            System.out.println("You are exactly 18.");
        }
        
    }
}


