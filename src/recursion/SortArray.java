package recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList(
                Arrays.asList(5,1,0,2,9,4,6)
        );

        sort(arr);
        System.out.println("sorted array");
        System.out.println(arr);
    }

    private static void sort(ArrayList<Integer> arr) {
        int size = arr.size();
        if (size == 0) { // base condition
            return;
        }
        Integer tmp = arr.get(size-1);
        arr.remove(size-1);

        // hypothesis - call sort() method for smaller list which will return sorted list.
        sort(arr);
        System.out.println("Before calling insert, arr ::"+arr+" , tmp ::"+tmp);
        // induction - insert tmp into the sorted list
        insert(arr, tmp);

    }

    private static void insert(ArrayList<Integer> arr, Integer tmp) { // arr is sorted here
        int size = arr.size();
        if (size==0 || tmp > arr.get(size-1)) {
            arr.add(tmp);
            return;
        }
        Integer lastElement = arr.get(size-1);
        arr.remove(size-1);
        // hypothesis - call insert() method for smaller list which will insert tmp into the list.
        insert(arr, tmp);

        arr.add(lastElement);
    }
}
