import java.util.Scanner;
public class multiexception {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]={5,6,7};
        System.out.println("Enter the value of a ");
        int a=sc.nextInt();
    
        int b =0;
        int c;
try{
   
    try{
System.out.println(arr[5]);
    }
    catch(ArrayIndexOutOfBoundsException e1){
System.out.println("Array Out of Bound exception resolved"+e1);
    }
    c = a / b;
}
 
 catch(ArithmeticException e2){
System.out.println("Arithmetic Exception is resolved "+e2);
   }
    }
}

