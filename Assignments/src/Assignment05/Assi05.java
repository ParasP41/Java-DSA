package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3};
        System.out.println(sum(arr));
    }

    static int sum(int[] arr) {
        if (arr.length == 3) {
            return arr[0] * arr[1] * arr[2];
        }
        int sum = 0;
        for (int i = 0, j = 1, k = 2; k == arr.length - 1; i++, j++, k++) {
            int x = arr[i] + arr[j] + arr[k];
            if (x > sum) {
                sum = x;
            }
        }
        if (arr[0] * arr[arr.length - 2] * arr[arr.length - 1]>sum) {
            sum=arr[0] * arr[arr.length - 2] * arr[arr.length - 1];
        }
        if (arr[0] * arr[1] * arr[arr.length - 1]>sum) {
            sum=arr[0] * arr[1] * arr[arr.length - 1];
        }
        return sum;
    }

//    static void sort1(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j - 1] < arr[j]) {
//                    swap(arr, j, j - 1);
//                }
//            }
//        }
//    }

//    static void swap1(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
