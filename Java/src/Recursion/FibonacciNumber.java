package Recursion;

public class FibonacciNumber {

    public static void main(String[] args){
        System.out.println(fibonacciNumber(5));
    }

    public static int fibonacciNumber(int n){
        if (n<=1) return n;
        return fibonacciNumber(n-1)+fibonacciNumber(n-2);
    }
}
