public class Stringreverse{
   public static void Strrev(int n,String str){
       if(n==0){
        return;
       }
       System.out.print(str.charAt(n - 1));
       Strrev(n-1,str);
      
   }
    public static void main(String[]args){
        String str="abcd";
        int n=str.length();
        Strrev(n,str);
    }  
}
