package Stacks;

import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(') return false;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[') return false;
                    break;
                case '}':
                    if (stack.isEmpty() || stack.pop() != '{') return false;
                    break;
                default:
                    stack.push(ch);
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses vp = new ValidParentheses();

        String test1 = "()[]{}";
        String test2 = "([)]";
        String test3 = "{[()]}";

        System.out.println("Test 1: " + vp.isValid(test1)); // true
        System.out.println("Test 2: " + vp.isValid(test2)); // false
        System.out.println("Test 3: " + vp.isValid(test3)); // true
    }
}