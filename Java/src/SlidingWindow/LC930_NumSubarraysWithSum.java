package SlidingWindow;

public class LC930_NumSubarraysWithSum {

    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmostgoal(nums, goal) - atmostgoal(nums, goal - 1);
    }

    public int atmostgoal(int[] nums, int goal) {
        int i = 0, j = 0, count = 0, sum = 0, k = goal;

        while (j < nums.length) {
            sum += nums[j];

            if (sum <= k) {
                count += j - i + 1;
            } else {
                while (i <= j && sum > k) {
                    sum -= nums[i];
                    i++;
                }
                if (sum != 0 && sum <= k) count += j - i + 1;
            }
            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        LC930_NumSubarraysWithSum solver = new LC930_NumSubarraysWithSum();
        int[] nums = {1, 0, 1, 0, 1};
        int goal = 2;
        int result = solver.numSubarraysWithSum(nums, goal);
        System.out.println("Number of subarrays with sum " + goal + ": " + result); // Output: 4
    }
}
