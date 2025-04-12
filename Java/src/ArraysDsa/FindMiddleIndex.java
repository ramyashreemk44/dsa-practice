package ArraysDsa;

public class FindMiddleIndex {

    public int findMiddleIndex(int[] nums) {
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
        int[] nums = {2, 3, -1, 8, 4};
        FindMiddleIndex finder = new FindMiddleIndex();
        int result = finder.findMiddleIndex(nums);
        System.out.println("Middle Index: " + result);  // Output: 3
    }
}
