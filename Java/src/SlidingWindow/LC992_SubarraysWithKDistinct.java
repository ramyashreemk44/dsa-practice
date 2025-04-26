package SlidingWindow;

import java.util.HashMap;

public class LC992_SubarraysWithKDistinct {

    public int subarraysWithKDistinct(int[] nums, int k) {
        int totalCount = 0, left_far = 0, left_near = 0, right = 0;
        HashMap<Integer, Integer> intCount = new HashMap<>();

        while (right < nums.length) {
            intCount.put(nums[right], intCount.getOrDefault(nums[right], 0) + 1);

            while (intCount.size() > k) {
                intCount.put(nums[left_near], intCount.get(nums[left_near]) - 1);
                if (intCount.get(nums[left_near]) == 0) intCount.remove(nums[left_near]);
                left_near++;
                left_far = left_near;
            }

            while (intCount.get(nums[left_near]) > 1) {
                intCount.put(nums[left_near], intCount.get(nums[left_near]) - 1);
                left_near++;
            }

            if (intCount.size() == k) totalCount += left_near - left_far + 1;
            right++;
        }

        return totalCount;
    }

    public static void main(String[] args) {
        LC992_SubarraysWithKDistinct solver = new LC992_SubarraysWithKDistinct();
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;
        int result = solver.subarraysWithKDistinct(nums, k);
        System.out.println("Subarrays with " + k + " distinct integers: " + result);  // Output: 7
    }
}
