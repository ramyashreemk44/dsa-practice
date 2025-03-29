package Stacks;

import java.util.Stack;

public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {
        int firstIndex = word.indexOf(ch);
        if (firstIndex == -1) return word;

        Stack<Character> stack = new Stack<>();
        StringBuilder result = new StringBuilder();

        // Push prefix to stack
        for (int i = 0; i <= firstIndex; i++) {
            stack.push(word.charAt(i));
        }

        // Pop to reverse
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }

        // Append the rest
        for (int i = firstIndex + 1; i < word.length(); i++) {
            result.append(word.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        ReversePrefixOfWord solver = new ReversePrefixOfWord();
        String word = "abcdefd";
        char ch = 'd';
        System.out.println("Result: " + solver.reversePrefix(word, ch));  // Output: dcbaefd
    }
}
