import java.util.*;
public class method{
    double java;
    double python; 
    double clang;
    public double calcaverage(double j,double py ,double c){
        return (j+py+c)/3;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        method s1=new method();
        method s2 = new method();
        method s3 = new method();
     System.out.println("Enter the marks of s1");
     s1.java=sc.nextDouble();
        s1.python = sc.nextDouble();
        s1.clang = sc.nextDouble();
     
        System.out.println("Enter the marks of s2");
        s2.java = sc.nextDouble();
        s2.python = sc.nextDouble();
        s2.clang = sc.nextDouble();
       
        System.out.println("Enter the marks of s3");
        s3.java = sc.nextDouble();
        s3.python = sc.nextDouble();
        s3.clang = sc.nextDouble();
        System.out.println("The average of S1 is : "+s1.calcaverage(s1.java, s1.python, s1.clang));
        System.out.println("The average of S2 is : " +s1.calcaverage(s2.java, s2.python, s2.clang));
        System.out.println("The average of S3 is : " +s3.calcaverage(s3.java, s3.python, s3.clang));
    }
}