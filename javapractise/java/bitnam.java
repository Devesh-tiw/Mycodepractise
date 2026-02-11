import java.util.*;
public class bitnam{
    public static void main(String[]args){
        Scanner sc=new Scanner (System.in);
     int n;
     System.out.println("Enter the value of n:");
     n=sc.nextInt();
    System.out.println("Enter the position:");
    int pos = sc.nextInt();
   int bitmask=1<<pos;
   if ((bitmask & n)== 0){
    System.out.println("bit manupulation is zero.");
   }
   else{
    System.out.println("Bit manupulation is not Zero.");
   }
    }
}