import java.util.*;
public class single{
public static void main(String[]args){
    Scanner sc= new Scanner(System.in);
    int single=0;
    int x[]={5,6,6,1,1,3,2,3,2};
    for (int j=0;j<x.length;j++){ 
   single=single^x[j];
    }
    System.out.println(single);
}
}