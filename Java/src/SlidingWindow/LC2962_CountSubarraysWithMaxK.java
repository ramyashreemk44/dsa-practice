package SlidingWindow;

public class LC2962_CountSubarraysWithMaxK {

    public long countSubarrays(int[] nums, int k) {
        int maxval = Integer.MIN_VALUE, i = 0, j = 0, maxvalcount = 0, n = nums.length;
        long count = 0;

        // Find maximum value in array
        for (int val : nums) {
            maxval = Math.max(maxval, val);
        }

        while (j < n) {
            if (nums[j] == maxval) maxvalcount++;

            if (maxvalcount >= k) {
                while (i <= j && maxvalcount >= k) {
                    count += n - j;
                    if (nums[i] == maxval) maxvalcount--;
                    i++;
                }
            }

            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        LC2962_CountSubarraysWithMaxK solver = new LC2962_CountSubarraysWithMaxK();
        int[] nums = {1, 3, 3, 3, 2};
        int k = 2;
        long result = solver.countSubarrays(nums, k);
        System.out.println("Valid subarray count: " + result);  // Output: 6
    }
}
