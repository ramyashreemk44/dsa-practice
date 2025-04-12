package ArraysDsa;

public class DominantIndex {

    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0;

        int largest = -1, secondLargest = -1, index = -1;

        for (int i = 0; i < nums.length; i++) {
            if (largest <= nums[i]) {
                secondLargest = largest;
                index = i;
                largest = nums[i];
            } else if (secondLargest < nums[i]) {
                secondLargest = nums[i];
            }
        }

        return largest >= (secondLargest * 2) ? index : -1;
    }

    public static void main(String[] args) {
        int[] nums = {3, 6, 1, 0};
        DominantIndex solver = new DominantIndex();
        int result = solver.dominantIndex(nums);
        System.out.println("Dominant Index: " + result);  // Output: 1
    }
}

