import java.util.*;
public class rev{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int n;
int rev[]= new int[20];
System.out.print("Enter the value of n:");
n=sc.nextInt();
int arr[]=new int[20];
System.out.print("Enter the value of array:");
for(int i=0;i<n;i++)
arr[i]=sc.nextInt();

for(int i=0;i<n;i++){
    rev[n-i-1]=arr[i];
}
for(int i=0;i<n;i++){ 
System.out.print(rev[i]);
}

}
}