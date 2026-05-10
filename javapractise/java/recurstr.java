public class recurstr{
   void stringrecur(String str) {
    char x = 'x';
    String be = "";
    String ba = "";

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == x) {
            be = be + str.charAt(i);
        } else {
            ba = ba + str.charAt(i);
        }
    }
    

    System.out.println(ba + be);

}
    public static void main(String[] args) {
          recurstr obj = new recurstr();
       obj.stringrecur("axbcxxd");
    }
}