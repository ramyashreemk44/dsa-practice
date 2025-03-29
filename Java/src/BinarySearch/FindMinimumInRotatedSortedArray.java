package BinarySearch;

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int res = Integer.MAX_VALUE;
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            res = Math.min(res, nums[mid]);

            if (nums[mid] > nums[right]) {
                // Minimum is in the right half
                left = mid + 1;
            } else {
                // Minimum is in the left half (or at mid)
                right = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        FindMinimumInRotatedSortedArray solver = new FindMinimumInRotatedSortedArray();

        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {4, 5, 6, 7, 0, 1, 2};

        System.out.println("Minimum in nums1: " + solver.findMin(nums1));  // Output: 1
        System.out.println("Minimum in nums2: " + solver.findMin(nums2));  // Output: 0
    }
}
