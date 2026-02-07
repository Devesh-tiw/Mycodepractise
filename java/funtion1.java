import java.util.*;
public class funtion1{
public static int add(int a,int b){
    return a+b;
}
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum,a,b;
        System.out.println("Enter the value of a and b ");
        a =sc.nextInt();
        b = sc.nextInt();
       sum= add(a,b);
        System.out.println("the sum of two number is :"+sum);

        


    }
}