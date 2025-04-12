package ArraysDsa;

public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0, n1 = nums1.length, n2 = nums2.length;
        int[] mergedArray = new int[n1 + n2];

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                mergedArray[k++] = nums1[i++];
            } else {
                mergedArray[k++] = nums2[j++];
            }
        }

        while (i < n1) mergedArray[k++] = nums1[i++];
        while (j < n2) mergedArray[k++] = nums2[j++];

        int mid = mergedArray.length / 2;
        if ((n1 + n2) % 2 != 0) return (double) mergedArray[mid];

        return (mergedArray[mid - 1] + mergedArray[mid]) / 2.0;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        MedianOfTwoSortedArrays solver = new MedianOfTwoSortedArrays();
        double median = solver.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + median);  // Output: 2.0
    }
}
