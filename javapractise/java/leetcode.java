
import java.util.Stack;

public class leetcode {

    public static void main(String[] args) {
        String s = "()";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("Invalid Parenthesis");
                    return;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(')
                        || (c == '}' && top != '{')
                        || (c == ']' && top != '[')) {
                    System.out.println("Invalid Parenthesis");
                    return;
                }
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Valid Parenthesis");
        } else {
            System.out.println("Invalid Parenthesis");
        }
    }
}
