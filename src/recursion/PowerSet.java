package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    static int countOfCalls = 0;
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,4,2}));
    }

    public static List<List<Integer>> subsets(int[] input) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();
        backtrack(input, 0, output, tmpList);
        System.out.println(countOfCalls);
        return output;
    }

    static void backtrack(int[] input, int start, List<List<Integer>> output, List<Integer> tmpList) {
        countOfCalls++;
        output.add(new ArrayList<>(tmpList));
        int size = input.length;
        for (int i=start; i<size; i++) {
            tmpList.add(input[i]);
            backtrack(input, i+1, output, tmpList);
            tmpList.remove(tmpList.size()-1);
        }
    }
}
