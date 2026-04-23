public class userdefined extends Exception {

    public userdefined(String Inlegalmessage) {
        super(message);
public class demo{
    public static void main(String[] args) {
        try {
            int age=15;
            if(age<18){
                System.out.println("Inlegalmessage");
            }
        } catch ( userdefined e) {

        }
    }
}
    }
    
}
