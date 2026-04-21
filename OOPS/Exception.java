import java.util.Scanner;
public class Exception{
    public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Value of a");
int a=sc.nextInt();
System.out.println("Enter the value of B");
int b=sc.nextInt();
int c=0;
try {
     c=a/b;
} catch (ArithmeticException e) {
    System.out.println("Exception Handled "+e);
    
}
System.out.println(c);
    }
    
}