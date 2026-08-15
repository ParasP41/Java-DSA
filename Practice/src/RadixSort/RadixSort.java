package RadixSort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr={3,5,4,2,4,5};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static int[] mergeSort(int[] arr){
        if (arr.length==1){
            return arr;
        }
        int mid=arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergeSort(Arrays.copyOfRange(arr,mid,arr.length));
        return left;
    }

}
