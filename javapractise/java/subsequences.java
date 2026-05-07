public class subsequences {
    public static void sub(String str,int idx,String newstr){

if(idx==str.length()){
    System.out.println(newstr);
    return;
}
char currentchar=str.charAt(idx);
sub(str, idx+1, newstr+currentchar);
sub(str, idx+1, newstr);

    }
    
    public static void main(String[]args){
subsequences s=new subsequences();
s.sub("abc", 0, "");
    }
}
