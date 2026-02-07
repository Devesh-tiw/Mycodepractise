import java.util.*;
public class gcdque{
    public static int GCD(int a,int b){
               while(b!=0){
            
           int remainder =a%b;
           a = b;
            b=remainder;
        }
      
        return a;
    }
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int a,b,gcd;
        System.out.println("Enter the value a,b :");
        a=sc.nextInt();
        b=sc.nextInt();
        gcd=GCD(a,b);
        System.out.println(gcd);
    }
}