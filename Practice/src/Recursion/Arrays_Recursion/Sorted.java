package Recursion.Arrays_Recursion;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
//        arr(arr,1);
        System.out.println(arr1(arr,1));
    }

//    static void arr(int[] arr, int i) {
//        if (i == arr.length) {
//            System.out.println(true);
//            return;
//        }
//        if (arr[i] < arr[i - 1]) {
//            System.out.println(false);
//            return;
//        }
//        arr(arr,i+1);
//    }

    static boolean arr1(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        return arr[i]<arr[i+1] && arr1(arr,i+1);
    }
}
