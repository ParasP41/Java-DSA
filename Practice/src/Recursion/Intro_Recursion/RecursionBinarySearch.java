package Recursion.Intro_Recursion;

public class RecursionBinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(RBS(7, 0, arr.length - 1, arr));
    }

    static int RBS(int target, int start, int end, int[] arr) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        }
        if (target > arr[mid]) {
            return RBS(target,mid+1,end,arr);
        }
        return RBS(target,start,mid-1,arr);
    }
}
