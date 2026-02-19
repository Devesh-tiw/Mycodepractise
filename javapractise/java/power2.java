public class power2{
public static void main(String []args){
    int n=3;
    boolean digit=true;
    int output=1;
    while(output<=n){
       if(output==n){
       digit=true;
       }
       else{
        digit =false;
       }
        output=output<<1;

       }
       System.out.println(digit);
   
   
}
}