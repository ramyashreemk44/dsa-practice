package Stacks;

import java.util.Stack;

public class MakeTheStringGreat {

    public String makeGood(String inputString) {
        Stack<Character> stack = new Stack<>();

        for (char c : inputString.toCharArray()) {
            if (!stack.isEmpty() && Math.abs(stack.peek() - c) == 32) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        MakeTheStringGreat solver = new MakeTheStringGreat();

        String input = "leEeetcode";
        System.out.println("Result: " + solver.makeGood(input));
    }
}