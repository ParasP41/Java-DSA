package Recursion.ArraysProblem;

public class SearchInMountain {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3};
        System.out.println(search(arr, 1));
    }

    //1
    static int search(int arr[], int target) {
        int piviot = piviot(arr, 0, arr.length - 1);
        int search1 = Binarysearch(arr, 0, piviot - 1, target);
        int search2 = Binarysearch(arr, piviot, arr.length - 1, target);
        if (search1 != -1) {
            return search1;
        }
        return search2;
    }

    static int piviot(int[] arr, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[start] < arr[mid]) {
            return piviot(arr, mid, end);
        } else if (arr[end] > arr[mid]) {
            return piviot(arr, start, mid);
        }
        return mid + 1;
    }

    static int Binarysearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (target > arr[mid]) {
            return Binarysearch(arr, mid + 1, end, target);
        }
        if (target < arr[mid]) {
            return Binarysearch(arr, start, mid - 1, target);
        }
        return mid;
    }

    //2
    static int search(int[] arr, int target, int s, int e) {
        if (s > e) {
            return -1;
        }

        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        }

        if (arr[s] <= arr[m]) {
            if (target >= arr[s] && target <= arr[m]) {
                return search(arr, target, s, m - 1);
            } else {
                return search(arr, target, m + 1, e);
            }
        }

        if (target >= arr[m] && target <= arr[e]) {
            return search(arr, target, m + 1, e);
        }

        return search(arr, target, s, m - 1);
    }
}
