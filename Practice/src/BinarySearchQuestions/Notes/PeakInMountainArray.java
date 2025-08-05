package BinarySearchQuestions.Notes;
//https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        System.out.println(peak(arr)); // Output should be 3
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                // You're in the decreasing part of the array
                // So the peak is at mid or to the left
                end = mid;
            } else {
                // You're in the increasing part of the array
                start = mid + 1;
            }
        }
        // start == end, which is the peak index
        return arr[start];
    }
}
