package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 5, 7, 8, 10, 11};
        int[] arr={90,80,70,60,50,40,30,20,10,1};
        System.out.println(orderAgnosticBS(arr, 80));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean check = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 10;
            if (arr[mid] == target) {
                return mid;
            }
            if (check) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else if (!check) {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
