public class firstlast{
public static void main(String[]args){
    String str="abaacdaefaah";
    int n=str.length();
    char s= 'a';
    int i=0;
    int last=0;
    int first = 0;
    while (i < n) {
        if (str.charAt(i) == s) {
            first = i;
          break;
        }
        i++;
    }
    while(i<n){
        if(str.charAt(i)==s){
         last=i;
   
        }
        i++;
    }
    System.out.println(n);
    System.out.println(first + 1);
    System.out.println(last+1);
}
}
