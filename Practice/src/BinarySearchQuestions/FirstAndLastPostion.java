package BinarySearchQuestions;

import java.util.Arrays;

public class FirstAndLastPostion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 6, 7, 7, 8, 8, 8, 10, 19};
//        int[] x = bruit(arr, 8);
//        System.out.println(Arrays.toString(x));

        int[] y = binary(arr, 8);
        System.out.println(Arrays.toString(y));

    }
//
//    static int[] bruit(int[] arr, int target) {
//        int[] ind = new int[2];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == target) {
//                ind[0] = i;
//                break;
//            }
//        }
//        for (int i = arr.length - 1; i > 0; i--) {
//            if (arr[i] == target) {
//                ind[1] = i;
//                break;
//            }
//        }
//        return ind;
//    }

    static int[] binary(int[] arr, int target) {
        int[] ind = {-1, -1};
        ind[0] = search(arr, target, true);
        if (ind[0] != -1) {
            ind[1] = search(arr, target, false);
        }


        return ind;
    }

    static int search(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;
        int[] ind = {-1, -1};
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
