import java.util.*;
public class factorial{
    public static int fact(int n){
        int product = 1;
        for(int i = n;i>0;i--){
           
             product= product*i;
            
             } 
             System.out.println(product);
             return product;   }
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n;
    System.out.println("Enter the value of n ");
    n=sc.nextInt();
    int product=fact(n);
    


}
}