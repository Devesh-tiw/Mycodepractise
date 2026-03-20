public class palindromeleet {
    public static void main(String[] args) {
        String S = ".a";
        
        StringBuilder cleanString = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            if (Character.isLetterOrDigit(current)) {
                cleanString.append(Character.toLowerCase(current));
            }
        }
       
        
      
        StringBuilder R1 = new StringBuilder(cleanString).reverse();
        int flag = 0;
        for (int j = 0; j < cleanString.length(); j++) {
            if (cleanString.charAt(j) != R1.charAt(j)) {
                flag = 1;
            }
        }
        
        if (flag == 1) {
            System.out.println("false");
        } else {
            System.out.println("true");
        }
    }
}
