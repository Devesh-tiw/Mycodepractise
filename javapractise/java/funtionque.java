import java.util.*;
public class funtionque{
    public static int sum(int n)
    {   int sum=0;
        for (int i = 0; i < n; i+=2) {
            sum=sum+i;
        }
        System.out.println(sum);
        return sum;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n,add;
        System.out.println("Enter the value of n is :");
        n=sc.nextInt();
        sum(n);
       
    } 
}