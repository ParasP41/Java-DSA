package BinarySearchQuestions.Notes;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 7, 7, 7, 8, 8, 10};
        System.out.println(Arrays.toString(finalindex(arr,8)));
    }

    static int[] finalindex(int[] arr, int target) {
        int[] tam = new int[2];
        tam[0] = firstIndex(arr, target);
        tam[1] = lastIndex(arr, target);
        return tam;
    }

    static int firstIndex(int[] arr, int target) {
        int left = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                left = mid;
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return left;
    }

    static int lastIndex(int[] arr, int target) {
        int right = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                right = mid;
                start = mid + 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return right;
    }
}
