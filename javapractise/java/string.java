import java.util.*;
public class string{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENter the first name and last name : ");
        String firstname=sc.next();
        String lastname=sc.next();
       
        
        String Fullname=firstname+" "+lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());
        char arr[] = Fullname.toCharArray();
        char rev[] = new char[20];
        for(int i=0;i<Fullname.length();i++){
               rev[Fullname.length()-i-1]=arr[i];
             
        }
        for (int i = 0; i < Fullname.length(); i++) {
            System.out.print(rev[i]);

        }
       
    }
    
}