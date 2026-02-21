public class needle{
    public static int main(String []args){
        String needle = "sad" ;
        String haystack = "sudbutsad";
        int flag=1;
      for(int i=0;i<needle.length();i++){
        if(needle.charAt(i)!=haystack.charAt(i)){
           flag=0;
        }
      }
      if (flag==0){
       return -1;
      }
      else{
        return 0;
      }
     } 
}