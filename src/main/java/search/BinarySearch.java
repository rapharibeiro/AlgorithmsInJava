package search;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/***
 * Type: Search Algorithm
 * Complexity: O(log n)
 */
public class BinarySearch {

    /***
     *
     * @param values list of values
     * @param key key value
     * @return searched value or -1(invalid)
     */
    public int binarySearch(int[] values, int key) {
        int low = 0;
        int high = values.length;
        int mid;

        while (low <= high && key <= high) {
            mid = (low + high) / 2;

            if (values[mid] < key) {
                low = mid + 1;
            } else if (values[mid] > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public int binarySearchRecursive(int[] values, int key, int low, int high) {
        if (low > high && key > high) return -1;

        int mid = (low + high) / 2;

        if (values[mid] < key) return binarySearchRecursive(values, key, mid + 1, high);
        else if (values[mid] > key) return binarySearchRecursive(values, key, low, mid - 1);
        else return mid;
    }

    public int binarySearchCollections(List<Integer> values, int search) {
        return Collections.binarySearch(values, search);
    }

    public int binarySearchArrays(List<Integer> values, int search) {
        return Arrays.binarySearch(values.toArray(), search);
    }

}
