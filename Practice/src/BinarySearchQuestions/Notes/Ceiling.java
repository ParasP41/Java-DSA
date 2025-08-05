package BinarySearchQuestions.Notes;

//Ceil-->Smallest number greater than equal to target
public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 7, 9};
        System.out.println(ceiling(arr, 10));
    }

    static int ceiling(int[] arr, int target) {
        //But what if the target is greater than the greater number in the array
        if (target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
