package BinarySerachIn2D;

import java.util.Arrays;

public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {28, 29, 37, 49},
                {33, 34, 38, 50}
        };
        System.out.println(Arrays.toString(search(arr, 50)));
    }

    static int[] search(int[][] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start < arr.length && end >= 0) {
            if (arr[start][end] == target) {
                return new int[]{start, end};
            }
            if (arr[start][end] < target) {
                start++;
            } else {
                end--;
            }
        }
        return new int[]{-1, -1};
    }
}
