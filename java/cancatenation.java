
import java.util.*;
public class cancatenation{
 public static void main(String[] args) {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the first name ");
     String Name=sc.next();
     System.out.print("Enter the Surname ");
     String Surname =sc.next();
     String concatenation=(Name+" " +Surname);
     System.out.println(concatenation);
     for (int i = 0; i < concatenation.length(); i++) {
        System.out.println(concatenation.charAt(i));
         
     }
 }
}
