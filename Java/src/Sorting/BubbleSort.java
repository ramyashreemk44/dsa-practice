package Sorting;

import java.util.Arrays;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;  // already sorted
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = {4, 3, 2, 8, 6, 5, 0, 99, 0, 1, 2, 3, 4};
        int[] result = bubbleSort(input, input.length);
        System.out.println("Bubble Sort result: " + Arrays.toString(result));
    }
}
