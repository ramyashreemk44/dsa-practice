package SlidingWindow;

public class LC713_NumSubarrayProductLessThanK {

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int product = 1, j = 0, i = 0, count = 0;

        while (j < nums.length) {
            product *= nums[j];

            if (product < k) {
                count += j - i + 1;
            } else {
                while (i <= j && product >= k) {
                    product /= nums[i];
                    i++;
                }
                if (product != 1 && product < k) {
                    count += j - i + 1;
                }
            }

            j++;
        }

        return count;
    }

    public static void main(String[] args) {
        LC713_NumSubarrayProductLessThanK solver = new LC713_NumSubarrayProductLessThanK();
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int result = solver.numSubarrayProductLessThanK(nums, k);
        System.out.println("Number of subarrays with product less than " + k + ": " + result);  // Output: 8
    }
}
