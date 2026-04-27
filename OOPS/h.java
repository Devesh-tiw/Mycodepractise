import java.util.Scanner;
public class h {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n;
        float sum=0;
        int count=0;
        float average=0;
        System.out.println("Enter the value of N");
        n=sc.nextInt();
        float []arr=new float[n];
        System.out.println("Enter the value of array ");
        for(int i=0;i<n;i++){
             arr[i]=sc.nextInt();
             sum +=arr[i];
        }
        average=sum/n;
      for(int i=0;i<n;i++){
        if(arr[i]>=average){
count++;
        }
      }
System.out.println("        "+count);
    }
}
