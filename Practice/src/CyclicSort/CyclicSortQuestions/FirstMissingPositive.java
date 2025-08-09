package CyclicSort.CyclicSortQuestions;
//https://leetcode.com/problems/first-missing-positive/description/
import java.util.Arrays;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0};
        System.out.println(missingPositive(arr));
    }

    static int missingPositive(int[] arr) {
        sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                return i + 1;
            }
        }
        return arr.length;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            int correct = arr[i] - 1; // for numbers 1 to n
//            int correct = arr[i]; // for numbers 0 to n
            if (arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
