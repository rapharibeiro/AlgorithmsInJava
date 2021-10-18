package search;

import search.BinarySearch;

public class Main {

    public static void main(String[] args) {

        int[] values = {11, 12, 13, 14, 15, 16, 17, 18, 19};
        int search = 47;

        BinarySearch binarySearch = new BinarySearch();
        int result = binarySearch.binarySearch(values, search);

        if (result == -1) System.out.println("Value is not present");
        else System.out.println("Value found at index " + result);

    }

}
