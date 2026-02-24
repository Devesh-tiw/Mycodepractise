public class climb{
    public static int fact(int n){
        
        if(n==0||n==1 ){
            return 1;
        }
       
            return n*fact(n-1);}
 public static void main(String[]args){
    int n=3;
    int r=1;
    int pattern=(fact(n)/fact(n-r));
    System.out.println(pattern);
 }
}