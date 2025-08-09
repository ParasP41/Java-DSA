package CyclicSort.CyclicSortQuestions;
//https://leetcode.com/problems/find-the-duplicate-number/description/

import java.util.Arrays;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(sort(arr));
    }

    //1
    static int sort(int[] arr) {
        int i = 0;
        while (i < arr.length - 1) {
            int correct = arr[i] - 1; // for numbers 1 to n
//            int correct = arr[i]; // for numbers 0 to n
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        return arr[arr.length - 1];
    }


    //2
    static int sort2(int[] arr) {
        int i = 0;
        while (i < arr.length) {

            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
