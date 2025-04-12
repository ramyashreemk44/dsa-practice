package Sorting;

import java.util.Arrays;

public class QuickSort {

    public static int[] quicksort(int[] arr, int s, int e) {
        if (e - s < 1) return arr;

        int left = s;
        int pivot = arr[e];
        int temp;

        for (int i = s; i < e; i++) {
            if (arr[i] < pivot) {
                temp = arr[i];
                arr[i] = arr[left];
                arr[left++] = temp;
            }
        }

        arr[e] = arr[left];
        arr[left] = pivot;

        quicksort(arr, s, left - 1);
        quicksort(arr, left + 1, e);

        return arr;
    }

    public static void main(String[] args) {
        int[] input = {3, 2, 9, 5, 6, 0, 11, 10};
        int[] result = quicksort(input, 0, input.length - 1);
        System.out.println("Quicksort result: " + Arrays.toString(result));
    }
}

