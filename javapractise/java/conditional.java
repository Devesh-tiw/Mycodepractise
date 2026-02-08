
public class conditional {

    public static void main(String[] args) {
        boolean isSubscribed = true;


        String status;
        if (isSubscribed) {
            status = "Premium User";
        } else {
            status = "Free User";
        }
        String displayStatus = (isSubscribed) ? "Premium User" : "Free User";

        System.out.println(displayStatus);

    }
}

