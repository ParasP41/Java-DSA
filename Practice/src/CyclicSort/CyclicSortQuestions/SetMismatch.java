package CyclicSort.CyclicSortQuestions;
//https://leetcode.com/problems/set-mismatch/description/
import java.util.ArrayList;
import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr = {2,2};
//        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(Mismatch(arr)));
    }

    static int[] Mismatch(int[] arr) {
        sort(arr);
        int[] mat=new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - 1 != i) {
                mat[0]=arr[i];
                mat[1]=i+1;
            }
        }
        return mat;
    }

    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1; // for numbers 1 to n
//            int correct = arr[i]; // for numbers 0 to n
            if (arr[i] != arr[correct]) {
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
