package Day4;


import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr) {
        if (arr.length > 1) {
            int mid = arr.length / 2;
            int[] leftHalf = Arrays.copyOfRange(arr, 0, mid);
            int[] rightHalf = Arrays.copyOfRange(arr, mid, arr.length);

            mergeSort(leftHalf);
            mergeSort(rightHalf);

            merge(arr, leftHalf, rightHalf);
        }
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < left.length) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < right.length) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }

    public static void main(String[] args) {
        int[] inputArray = {6, 12, 11, 13, 5, 6, 7};
        mergeSort(inputArray);

        System.out.print("Sorted array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }
    }
}
