public class nfact{
    public static void factorial(int i,int n, int fact){
    if(i==n){
        fact*=i;
        System.out.println(fact);
        return;
    }
    fact*=i;
    factorial(i+1,n,fact);}
    public static void main(String [] args){
    
    factorial(1,5,1);
    }
    }
