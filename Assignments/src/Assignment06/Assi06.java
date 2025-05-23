package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        System.out.println(search(arr, 0));
    }

    public static boolean search(int[] arr, int target) {
        int pivot = findPivot(arr);

        if (pivot == 0) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        } else {
            return binarySearch(arr, target, pivot, arr.length - 1);
        }
    }

    public static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        if (arr.length == 1 || arr[start] < arr[end]) return 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) return mid + 1;
            if (mid > start && arr[mid] < arr[mid - 1]) return mid;

            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0;
    }

    public static boolean binarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) return true;
            else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return false;
    }


//    public static int search(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            ;
//            if (target == arr[mid]) {
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }


}
