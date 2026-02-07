import java.util.*;
public class Loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n is: ");
        
        int n = sc.nextInt();
        int a,table=0;
        for(a=0;a<10;a++){
            table = n*a;
            
                
           System.out.println(table);}
    }
}