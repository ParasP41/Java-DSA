package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid-1]<arr[mid] && arr[mid]>arr[mid+1])
            {
                return mid;
            }
//            if (target == arr[mid]) {
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
            else {
                start=mid+1;
            }
        }
        return -1;
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
