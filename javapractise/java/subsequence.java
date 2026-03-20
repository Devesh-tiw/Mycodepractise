public class subsequence{
    public static void main(String[]args){
        String s= "aza";
        String t ="abzba";
        String same="";
        int k=0;
        for(int i=0;i<s.length();i++){
            for(int j=k;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
              same += s.charAt(i);
               k=j+1;
               break;
                }
            }
        }
         if(s.equals(same)){
            System.out.println("true");
         }
         else{
            System.out.println("false");
         }
    }
   

}