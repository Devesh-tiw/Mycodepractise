
public class sumrecur{

    public static void printnum(int i,int n,int sum) {
        if (i == n) {
            sum+=i;
            System.out.print(sum);
            return;
        }
          sum +=i;
  
        
       
printnum(i+1,n,sum);
    }

    public static void main(String[] args) {
        printnum(1,5,0);
    }
}
