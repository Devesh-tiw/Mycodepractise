import java.util.Scanner;

public class arithmatic {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value of a");
        int a=sc.nextInt();
        System.out.println("Enter the  value of B");
        int b=sc.nextInt();
        int c;
      try{
c=a/b;
      }
      catch(ArithmeticException e){
System.out.println("Arithmetic Exception is resolved "+e);
      }

    }
    
}
