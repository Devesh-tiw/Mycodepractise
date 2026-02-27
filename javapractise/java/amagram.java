
import java.util.Arrays;

public class amagram {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char a[] = s.toCharArray();
        char b[] = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        if (Arrays.equals(a, b)) {
            System.out.println("String is Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
}
