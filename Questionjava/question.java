import java.util.*;
public class question{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        float average;
        System.out.println("Enter the value of a ,b ,c:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        average=(a+b+c)/3;
        System.out.println("The avergage of three number is "+average);
        
        
    }
}