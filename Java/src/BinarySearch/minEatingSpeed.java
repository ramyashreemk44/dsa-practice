package BinarySearch;

import java.util.*;

public class minEatingSpeed {
    public static void main(String[] args) {
        // Example test case
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1000000000;

        int result = minEatingSpeed(piles, h);
        System.out.println("Minimum eating speed: " + result);
    }

    public static int minEatingSpeed(int[] piles, int h) {
        int l = 1, res = Integer.MAX_VALUE, mid = 0;
        long sum = 0;

        int r = 0;
        for (int val : piles) {
            r = Math.max(r, val);
        }

        while (l <= r) {
            mid = (l + r) / 2;
            sum = 0;
            for (int val : piles) {
                sum += (val + mid - 1L) / mid;
            }

            if (sum <= h) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}
