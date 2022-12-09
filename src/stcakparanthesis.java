import java.util.EmptyStackException;
import java.util.Stack;
public class stcakparanthesis {
    private static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        try {
            System.out.println(match("(((){}[]"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean match(String prans) throws Exception {
        Stack<Character> stack = new Stack();
        char chars[] = prans.toCharArray();
        for (char c : chars) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                try {
                    char t = stack.pop();
                    if (t != '(') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            } else if (c == '}') {
                try {
                    char t = stack.pop();
                    if (t != '{') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            } else if (c == ']') {
                char t = stack.pop();
                try {
                    if (t != '[') {
                        return false;
                    }
                } catch (EmptyStackException e) {
                    return false;
                }
            } else {
                throw new Exception("invalid:" + c);
            }
        }
        if (stack.isEmpty()) {
            return true;

        } else
            return false;
    }
}
