package sort;

import java.util.Arrays;

/***
 * Type: Sort Algorithm
 * Complexity: O(log n)
 */
public class QuickSort {

    private int partitionSecondSolution(int[] values, int low, int high) {
        int pivot = values[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (values[j] <= pivot) {
                i++;

                int swap = values[i];
                values[i] = values[j];
                values[j] = swap;
            }
        }

        int temp = values[i + 1];
        values[i + 1] = values[high];
        values[high] = temp;

        return i + 1;
    }

    public void sortSecondSolution(int[] array, int low, int high) {
        if (low < high) {
            int index = partitionSecondSolution(array, low, high);
            sortSecondSolution(array, low, index - 1);
            sortSecondSolution(array, index + 1, high);
        }
    }

    private int partitionFirstSolution(int[] values, int low, int high) {
        int pivot = values[(low + high) / 2];
        while (low <= high) {

            while (values[low] < pivot) low++;
            while (values[high] > pivot) high--;

            if (low <= high) {
                Utils.swap(values, low, high);
                low++;
                high--;
            }
        }
        return low;
    }

    public void sortFirstSolution(int[] array, int low, int high) {
        if (low < high) {
            int index = partitionFirstSolution(array, low, high);
            if (low < index - 1)
                sortFirstSolution(array, low, index - 1);
            if (index < high)
                sortFirstSolution(array, index, high);
        }
    }

    public void sortWithArrays(int[] array) {
        Arrays.sort(array);
    }

    public void quickSort(int[] array) {
        sortFirstSolution(array, 0, array.length - 1);
    }
}
