public class recurdupli {
    public static boolean [] map=new boolean[26];
    void delup (int idx,String str1,String strnew ){
        if(idx==str1.length()){
            System.out.println(strnew);
            return;
        }
        char currentchar=str1.charAt(idx);
if(map[currentchar-'a']){
    delup(idx+1, str1, strnew);
}
else{
    strnew+=currentchar;
    
    map[currentchar-'a']=true;
    delup(idx+1, str1, strnew);
}
    }
    public static void main(String[]args){
    recurdupli del=new recurdupli();
    del.delup(0, "avneet", "");
    }
}
