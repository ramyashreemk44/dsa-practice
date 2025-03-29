package Stacks;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+" -> stack.push(stack.pop() + stack.pop());
                case "-" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b - a);
                }
                case "*" -> stack.push(stack.pop() * stack.pop());
                case "/" -> {
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b / a);
                }
                default -> stack.push(Integer.parseInt(token));
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        EvaluateReversePolishNotation solver = new EvaluateReversePolishNotation();

        String[] tokens1 = {"2", "1", "+", "3", "*"};     // (2 + 1) * 3 = 9
        String[] tokens2 = {"4", "13", "5", "/", "+"};    // 4 + (13 / 5) = 6

        System.out.println("Result 1: " + solver.evalRPN(tokens1)); // Output: 9
        System.out.println("Result 2: " + solver.evalRPN(tokens2)); // Output: 6
    }
}
