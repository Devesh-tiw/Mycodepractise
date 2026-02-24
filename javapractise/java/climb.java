public class climb{
    public int climbsay(int n){
        
        if(n==0||n==1){
            return 1;
        }
       
            return climbsay(n-1)+climbsay(n-2);}
 public static void main(String[]args){
    climb c=new climb();
    int n=3;
    int r=1;
    int pattern=c.climbsay(n);
    System.out.println(pattern);
 }
}