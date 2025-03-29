package Stacks;

import java.util.Stack;

public class BackspaceStringCompare {

    public boolean backspaceCompare(String s, String t) {
        return buildFinalString(s).equals(buildFinalString(t));
    }

    private Stack<Character> buildFinalString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '#') {
                if (!stack.isEmpty()) stack.pop();
            } else {
                stack.push(ch);
            }
        }
        return stack;
    }

    public static void main(String[] args) {
        BackspaceStringCompare comp = new BackspaceStringCompare();

        String s = "ab#c";
        String t = "ad#c";

        System.out.println("Are strings equal after backspace? " + comp.backspaceCompare(s, t));  // true
    }
}
