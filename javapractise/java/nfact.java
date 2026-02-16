

public class nfact{
    public static int factorial(int n){
    if(n==1||n==0){
        return 1;
    }
    int fact = factorial(n-1);
    int factmul= n *fact;
              return factmul;}
        public static void main(String [] args){
    
    int ans=factorial(5);
    System.out.println(ans);
    }
    }
