import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of triangle");
int n=sc.nextInt();
for(int i=0;i<n;i++){
    for(int j=n;j>i;j--){
System.out.print(" ");
    }
    
    
    for (int k=0;k<i;k++) {
        System.out.print(" *");
    }
    System.out.println(" ");
}
    }}

