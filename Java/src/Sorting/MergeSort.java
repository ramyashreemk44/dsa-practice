package Sorting;

import java.util.Arrays;

public class MergeSort {

    public static int[] sortArray(int[] nums) {
        return mergesort(nums, nums.length);
    }

    public static int[] mergesort(int[] array, int n) {
        if (n < 2) return array;

        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) l[i] = array[i];
        for (int i = 0; i < n - mid; i++) r[i] = array[mid + i];

        mergesort(l, mid);
        mergesort(r, n - mid);

        merge(array, l, r, mid, n - mid);
        return array;
    }

    public static void merge(int[] nums, int[] l, int[] r, int right, int left) {
        int i = 0, j = 0, k = 0;
        while (i < right && j < left) {
            if (l[i] <= r[j]) nums[k++] = l[i++];
            else nums[k++] = r[j++];
        }
        while (i < right) nums[k++] = l[i++];
        while (j < left) nums[k++] = r[j++];
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 9, 5, 6, 0, 11, 10};
        int[] result = sortArray(input);
        System.out.println("Mergesort result: " + Arrays.toString(result));
    }
}
