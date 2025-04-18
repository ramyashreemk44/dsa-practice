package SlidingWindow;

public class NumOfSubarraysWithThreshold {

    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int i = 0, j = 0, count = 0, n = arr.length, sum = 0;

        while (j < n) {
            sum += arr[j];

            if (j - i + 1 < k) {
                j++;
            } else {
                if (sum / k >= threshold) count++;
                sum -= arr[i];
                i++;
                j++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        NumOfSubarraysWithThreshold solver = new NumOfSubarraysWithThreshold();
        int[] arr = {2, 1, 3, 4, 1, 2, 3, 4};
        int k = 3, threshold = 3;
        int result = solver.numOfSubarrays(arr, k, threshold);
        System.out.println("Count of valid subarrays: " + result);  // Expected: 3
    }
}

