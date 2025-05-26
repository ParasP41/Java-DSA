package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
        int[] arr = {5,1,1};
        System.out.println(findMin(arr));
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        if (nums.length - 1 == 0) {
            return nums[0];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid == 0) {
                if (nums[mid] <= nums[mid + 1]) {
                    return nums[mid];
                }
            }

            if(mid==nums.length-1){
                if (nums[mid] <= nums[mid - 1]) {
                    return nums[mid];
                }
            }

            if (nums[mid] < nums[mid + 1] && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            } else if (nums[mid] > nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start + (end - start) / 2;
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
