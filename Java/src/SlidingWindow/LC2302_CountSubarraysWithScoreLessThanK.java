package SlidingWindow;

public class LC2302_CountSubarraysWithScoreLessThanK {

    public long countSubarrays(int[] nums, long k) {
        int i = 0, j = 0;
        long count = 0, sum = 0;

        while (j < nums.length) {
            sum += nums[j];

            if (sum * (j - i + 1) < k) {
                count += j - i + 1;
            } else {
                while (i <= j && sum * (j - i + 1) >= k) {
                    sum -= nums[i];
                    i++;
                }
                count += j - i + 1;
            }

            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        LC2302_CountSubarraysWithScoreLessThanK solver = new LC2302_CountSubarraysWithScoreLessThanK();
        int[] nums = {2, 1, 4, 3, 5};
        long k = 10;
        long result = solver.countSubarrays(nums, k);
        System.out.println("Subarrays with score less than " + k + ": " + result);
    }
}
