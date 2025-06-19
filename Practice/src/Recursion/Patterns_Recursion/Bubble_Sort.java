package Recursion.Patterns_Recursion;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4, 5, 6, 4, 3};
        bs1(arr, arr.length-1,0);
        System.out.println(Arrays.toString(arr));
    }

    static void bs(int[] arr, int k) {
        if (k == arr.length) {
            return;
        }
        helper(arr, 0); // Start from index 0
        bs(arr, k + 1);
    }

    static void helper(int[] arr, int x) {
        if (x == arr.length - 1) {
            return;
        }
        if (arr[x] > arr[x + 1]) {
            swap(arr, x, x + 1);
        }
        helper(arr, x + 1);
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void bs1(int[] arr, int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[c + 1]) {
                int temp = arr[c];
                arr[c] = arr[c + 1];
                arr[c + 1] = temp;
            }
            bs1(arr, r, c + 1);
        } else {
            bs1(arr, r - 1, 0);
        }
    }


}
