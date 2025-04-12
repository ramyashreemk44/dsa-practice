package ArraysDsa;

public class PivotIndex {

    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;

        for (int num : nums) rightSum += num;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) return i;
            leftSum += nums[i];
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 7, 3, 6, 5, 6};
        PivotIndex solver = new PivotIndex();
        int result = solver.pivotIndex(nums);
        System.out.println("Pivot Index: " + result);  // Output: 3
    }
}

