public class sub {
    void subsequences(int idx,String str,String newString){
        if(idx==str.length()){
System.out.println(newString);
return;
        }

    char Currentchar=str.charAt(idx);
      subsequences(idx+1, str, newString+Currentchar);

      subsequences(idx+1, str, newString);
    }

public static void main(String[]args){
 sub obj = new sub();   // create object
        obj.subsequences(0, "abc", "");
}
}