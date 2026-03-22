public class repeated {
    public static void main(String[] args) {
         String s="abcbggaacz";
        int flag=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i+1)){
             flag=i;
               break;
            }
        }
        char dear=s.charAt(flag);
       
       System.out.println(dear);
    }}

