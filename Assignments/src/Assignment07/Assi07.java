package Assignment07;

import java.util.*;

public class Assi07 {
    public static void main(String[] args) {
        int[] nums1={4,9,5};
        int[] nums2={9,4,9,8,4};
        System.out.println(Arrays.toString(duplicate(nums1,nums2)));
    }

    static int[] duplicate(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (search(nums2, 0, nums2.length - 1, nums1[i]) != -1) {
                list.add(nums1[i]);
            }
        }

        // Convert ArrayList to array
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    static int search(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;

        if (target == arr[mid]) {
            return mid;
        }
        if (target > arr[mid]) {
            return search(arr, mid + 1, end, target);
        }
        return search(arr, start, mid - 1, target);
    }

}


