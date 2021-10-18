package sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] values = {21, 2, 33, 140, 15, 6, 37, 8, 19};

        QuickSort quickSort = new QuickSort();
        quickSort.quickSort(values);

        System.out.println(Arrays.toString(values));
    }
}
