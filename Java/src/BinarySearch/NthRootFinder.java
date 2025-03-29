package BinarySearch;

public class NthRootFinder {

    public static boolean isLessThanEqual(double a, int n, int m) {
        double res = 1.0;
        for (int i = 1; i <= n; i++) {
            res *= a;
            if (res > m) return false;
        }
        return true;
    }

    public static int findNthRoot(int n, int m) {
        double low = 1.0, high = m;
        double eps = 1e-8;

        while ((high - low) > eps) {
            double mid = (low + high) / 2.0;
            if (isLessThanEqual(mid, n, m)) {
                low = mid;
            } else {
                high = mid;
            }
        }

        int possibleRoot = (int)Math.round(low);
        double check = 1.0;
        for (int i = 1; i <= n; i++) check *= possibleRoot;

        if (Math.abs(check - m) < 1e-6) return possibleRoot;
        return -1;
    }

    public static void main(String[] args) {
        int n = 2, m = 9;
        System.out.println(findNthRoot(n, m));
    }
}
