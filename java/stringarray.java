import java.util.*;
public class stringarray{
    public static void main(String[] args) {
        Scanner fr=new Scanner(System.in);  
        System.out.println("Enter the Size :");
        int size=fr.nextInt();
        String names[]=new String[size];
        System.out.println("Enter the Names :");
        for(int i=0;i<size;i++){
            names[i]=fr.next();
            
        }
        for (int i = 0; i < size; i++) {
       System.out.println("The names are "+ names[i]+" ");
        }
     }
 }