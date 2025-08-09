package CyclicSort.CyclicSortQuestions;
//https://leetcode.com/problems/find-all-duplicates-in-an-array/description/
import java.util.ArrayList;
import java.util.Arrays;

public class FindAllDuplicateNumbres {
    public static void main(String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(AllDuplicate(arr));
    }
    static ArrayList<Integer> AllDuplicate(int[] arr)
    {
        sort(arr);
        System.out.println(Arrays.toString(arr));
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]-1!=i){
                list.add(arr[i]);
            }
        }
        return list;
    }
    static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length ) {
            int correct = arr[i] - 1; // for numbers 1 to n
//            int correct = arr[i]; // for numbers 0 to n
            if ( arr[i] != arr[correct]) {
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
