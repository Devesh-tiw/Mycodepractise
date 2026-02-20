public class integer{
public static int divide(int divisor,int dividend){
    if (dividend == Integer.MIN_VALUE && divisor == -1) {
        return Integer.MAX_VALUE;
    }
    return  dividend / divisor;
}
    public static void main(String[] args) {
      
        int divisor = 3;
        int  divident = 7;
      int Answer=divide(divisor,divident);
        System.out.println(Answer);
    }}
