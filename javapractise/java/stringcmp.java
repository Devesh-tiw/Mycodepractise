import java.util.*;
public class stringcmp{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        String name2;
        
        System.out.println("Enter the string 1 :");
        name=sc.next();
       int flag =0;
        System.out.print("Enter the String to compare :");
        name2=sc.next();
        if (name.length() != name2.length()) {
         System.out.println("Give same size of String:");
        }
        for (int i = 0; i < name.length(); i++) {
       
        if(name.charAt(i)!=name2.charAt(i)){
            flag = 1; 

        }
        }
       if(flag==0){
        System.out.println("Strings are equal");
       }
        else{
            System.out.println("Strings are not equal .");
        }
        

    }
}