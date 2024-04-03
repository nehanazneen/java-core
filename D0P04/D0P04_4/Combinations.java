public class Combinations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2};
        int k = 2; // Set the desired combination size

        printCombinations(arr, k);
    }

    static void printCombinations(int[] arr, int k) {
        int n = arr.length;
        int[] data = new int[k];
        combinationUtil(arr, data, 0, n - 1, 0, k);
    }

    static void combinationUtil(int[] arr, int[] data, int start, int end, int index, int r) {
        if (index == r) {
            for (int j = 0; j < r; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
            return;
        }

        for (int i = start; i <= end && end - i + 1 >= r - index; i++) {
            data[index] = arr[i];
            combinationUtil(arr, data, i + 1, end, index + 1, r);
        }
    }
}
