public class delduprecur {
    public static boolean[] map=new boolean[26];
    void deldup(int idx,String str,String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']){
            deldup(idx+1, str, newString);
        }
        else{
            newString+=currchar;
            map[currchar-'a']=true;
            deldup(idx+1, str, newString);

        }
    }
    
    public static void main(String[] args) {
         delduprecur obj = new delduprecur();
        obj.deldup(0, "abbsssseeesssssssdddscac", "");
    }
}
