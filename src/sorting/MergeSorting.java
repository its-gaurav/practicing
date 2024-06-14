package sorting;

public class MergeSorting {
    public static void main(String[] args) {
        int[] input = new int[]{9,5,7,11,1,3,2};

        mergeSort(input, 0, input.length-1);
        System.out.println("Sorted Array:");
        for (int ele: input) {
            System.out.print(ele+" ");
        }
    }

    static void mergeSort(int[] input, int low, int high) {
        if(low >=high) {
            return;
        }

        int mid = (low+high)/2;

        mergeSort(input, low, mid); // it will make left sub-array sorted
        mergeSort(input, mid+1, high); // it will make right sub-array sorted

        // once two sub-arrays are there sorted in themselves, they need to be merged
        merge(input, low, mid, high);
    }

    private static void merge(int[] input, int low, int mid, int high) {
        int lftStart = low;
        int rtStart = mid+1;
        int[] tmp = new int[(mid-low+1)+(high-mid)];
        int k=0;
        while(lftStart<=mid && rtStart<=high) {
            if (input[lftStart] < input[rtStart]) {
                tmp[k++] = input[lftStart++];
            }else {
                tmp[k++] = input[rtStart++];
            }
        }

        while (lftStart<=mid) { // if elements are still left in left sub-array
            tmp[k++] = input[lftStart++];
        }
        while (rtStart<=high) { // if elements are still left in right sub-array
            tmp[k++] = input[rtStart++];
        }

        // moving sorted elements from tmp to input
        for (int i=0; i<k; i++) {
            input[low+i] = tmp[i];
        }
    }
}
