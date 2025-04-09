package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6,1,2, 7, 8, 19,9 };
        int[] result=insertionSort(arr);
        System.out.println(Arrays.toString(result));
        }
    public static int[] insertionSort(int[] arr) {
        int j=0,temp=0;
        for (int i=1;i<arr.length;i++){
            j=i-1;
            while(j>=0 && arr[j+1]<arr[j]){
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
                j-=1;
            }
        }
        return arr;
    }
}

