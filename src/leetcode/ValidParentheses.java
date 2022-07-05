package leetcode;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();
        System.out.println(vp.isValid("()[]{}")); // true
        System.out.println(vp.isValid("([{}")); // false
        System.out.println(vp.isValid("(]")); // false
        System.out.println(vp.isValid("()")); // true
    }

    public boolean isValid(String s) {
        Stack<Character> leftBrackets = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if (temp == '(' || temp == '[' || temp == '{') {
                leftBrackets.push(temp);
            } else {
                if (leftBrackets.isEmpty()) return false;
                char left = leftBrackets.pop();
                String joined = left + "" + temp;
                if (!joined.equals("()") && !joined.equals("{}") && !joined.equals("[]")) return false;
            }
        }
        return leftBrackets.isEmpty();
    }
}
