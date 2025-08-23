package StriverRecursion;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(reverse(arr, 0, arr.length - 1)));
        System.out.println(Arrays.toString(reverse2(arr, 0)));
    }

    //1
    static int[] reverse(int[] arr, int i, int j) {
        while (i > j) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return reverse(arr, i + 1, j - 1);
    }

    //2
    static int[] reverse2(int[] arr, int i) {
        if (i >= arr.length / 2) {
            return arr;
        }
        int temp = arr[i];
        arr[i] = arr[arr.length - i - 1];
        arr[arr.length - i - 1] = temp;
        return reverse2(arr, i + 1);
    }
}
