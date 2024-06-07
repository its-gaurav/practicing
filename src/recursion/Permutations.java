package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static int countOfCalls = 0;

    public static void main(String[] args) {

        int[] input = new int[]{1, 2, 3};
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> tmpList = new ArrayList<>();

        permute(input, tmpList, output);
        System.out.println(countOfCalls);
        System.out.println(output);
    }

    static void permute(int[] input, List<Integer> tmpList, List<List<Integer>> output) {
        countOfCalls++;
        // if tmpList.size() == input.size() then tmpList is a part of our answer
        int inputSize = input.length;
        // base condition
        if(tmpList.size() == inputSize) {
            output.add(new ArrayList<>(tmpList)); // new ArrayList is required because we will be modifying this tmpList for further calculations
        } else {
            for (int i=0; i<inputSize; i++) { // loop is required from 0 to length since each elemnt needs to be considered in each combination.
                if (tmpList.contains(input[i])) { // if element already exists
                    continue;
                }
                tmpList.add(input[i]);
                permute(input, tmpList, output); // hypothesis - permute() will calculate for given input and tmpList
                tmpList.remove(tmpList.size()-1); // induction - removing last element so that we can check other combinations
            }
        }
    }
}
