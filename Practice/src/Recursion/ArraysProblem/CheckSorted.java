package Recursion.ArraysProblem;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        System.out.println(check2(0, arr));
    }

    //1
    static boolean check(int i, int[] arr) {
        if (i > arr.length - 2) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return check(i + 1, arr);
    }

    //2
    static boolean check2(int i, int[] arr) {
        if (i> arr.length-2) {
            return true;
        }
        return (arr[i] <= arr[i + 1]) && check2(i + 1, arr);
    }
}
