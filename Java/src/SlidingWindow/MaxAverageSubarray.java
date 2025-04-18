package SlidingWindow;

public class MaxAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        int i = 0, j = 0, n = nums.length;
        double sum = 0, answer = -Double.MAX_VALUE;

        while (j < n) {
            sum += nums[j];

            if (j - i + 1 < k) {
                j++;
            } else {
                answer = Math.max(answer, sum / k);
                sum -= nums[i];
                i++;
                j++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        MaxAverageSubarray solver = new MaxAverageSubarray();
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        double result = solver.findMaxAverage(nums, k);
        System.out.println("Max average of length " + k + " is: " + result);  // Output: 12.75
    }
}

