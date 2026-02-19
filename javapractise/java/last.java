

public class last{
    public static void main(String[]args){
    String name;
        int digit=0;
    name="devesh is my name";
    int n=name.length();
    for(int i=n-1;i>0;i--){
        if(name.charAt(i)==' '){
            break;
        }
        digit++;
    }
   
    String last = name.substring(n-digit,n);
    System.out.println(last);
    }
}