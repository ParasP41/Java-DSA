package BinarySearchQuestions.Notes;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class SearchinInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 9};
        System.out.println(ans(arr,9));
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start=newStart;
        }
        end = Math.min(end, arr.length - 1);
        return Infinite(arr,target,start,end);
    }

    static int Infinite(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
