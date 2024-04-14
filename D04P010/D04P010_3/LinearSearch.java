package Day4;


import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                int[][] inputArrays = {
            {5, 23, 4, 10, 40, 10},
            {5, 2, 3, 4, 10, 40, 90}
        };

                int[] targetElements = {10, 90};

        for (int i = 0; i < inputArrays.length; i++) {
            int[] arr = inputArrays[i];
            int target = targetElements[i];
            boolean isPresent = linearSearch(arr, target);

            if (isPresent) {
                System.out.println("Element " + target + " is present in the array: " + arrayToString(arr));
            } else {
                System.out.println("Element " + target + " is not present in the array: " + arrayToString(arr));
            }
        }
    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        return false;
    }

    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i