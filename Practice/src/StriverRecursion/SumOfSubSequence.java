package StriverRecursion;


import java.util.*;

public class SumOfSubSequence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(sequence1(arr, 0, list, 0, 3));
    }

    //1
    static void sequence(int[] arr, int i, ArrayList<Integer> list, int s, int sum) {
        if (i == arr.length) {
            if (s == sum) {
                for (int j = 0; j < list.size(); j++) {
                    System.out.print(list.get(j) + " ");
                }
                System.out.println();
            }
            return;
        }

        // include element
        list.add(arr[i]);
        s += arr[i];
        sequence(arr, i + 1, list, s, sum);

        // exclude element
        s -= arr[i];
        list.remove(list.size() - 1);
        sequence(arr, i + 1, list, s, sum);
    }


    //2
    static boolean sequence1(int[] arr, int i, ArrayList<Integer> list, int s, int sum) {
        // base case
        if (i == arr.length) {
            if (s == sum) {
                // print the subsequence
                for (int num : list) {
                    System.out.print(num + " ");
                }
                System.out.println();
                return true;  // found one subsequence
            }
            return false;
        }

        // include current element
        list.add(arr[i]);
        s += arr[i];
        if (sequence1(arr, i + 1, list, s, sum)) {
            return true; // stop once we find a valid subsequence
        }

        // backtrack (exclude current element)
        s -= arr[i];
        list.remove(list.size() - 1);

        if (sequence1(arr, i + 1, list, s, sum)) {
            return true;
        }

        return false; // no valid subsequence found
    }


}
