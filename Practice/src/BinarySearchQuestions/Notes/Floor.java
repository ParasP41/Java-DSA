package BinarySearchQuestions.Notes;

//Ceil-->Greatest number less than equal to target
public class Floor {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 6, 7, 9};
        System.out.println(ceiling(arr,3));
    }

    static int ceiling(int[] arr, int target) {
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
        return end;
    }
}
