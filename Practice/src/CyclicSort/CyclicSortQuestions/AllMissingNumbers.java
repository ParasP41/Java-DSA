package CyclicSort.CyclicSortQuestions;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

import java.util.ArrayList;
import java.util.List;

public class AllMissingNumbers {
    public static void main(String[] args) {
        int[] arr = {1,1};
        System.out.println(missing(arr));
    }

    public static List<Integer> missing(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
//            if (arr[i] < arr.length && arr[i] != arr[correct]) {//For non Duplicate array
            if (arr[i] <= arr.length && arr[i] != arr[correct]) {//For Duplicate array
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (j != arr[j] - 1) {
                list.add(j + 1);
            }
        }
        return list;
    }

    static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}
