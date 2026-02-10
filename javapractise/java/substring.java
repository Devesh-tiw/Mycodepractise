import java.util.*;
public class substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       char temp;
        String name;
        System.out.println("Enter the String ");
        name =sc.nextLine();
        char[]arr=name.toCharArray();
     for(int i=0,j=name.length()-1;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;            
        }
        for(int i=0;i<name.length();i++){
        System.out.print(arr[i]);
        }
        for (int i = name.length()-1; i > 0; i--) {
            System.out.print(arr[i]);
        }
    }
}