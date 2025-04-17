package Recursion;

public class FactorialOfN {
    public static void main(String[] args) {
        System.out.println(factorialOfN(5));
    }

    public static int factorialOfN(int n) {
        if (n<=1) return 1;

        return n*factorialOfN(n-1);
    }
}
