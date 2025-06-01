package Assignment05;


import java.util.ArrayList;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(arr));
    }

    public static int maxSubArray(int[] arr) {
        int MAX_VALUE = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (MAX_VALUE < sum) {
                MAX_VALUE = sum;
            }
            if (sum < 0) {
                sum = 0;
            }

        }
        return MAX_VALUE;
    }

//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



