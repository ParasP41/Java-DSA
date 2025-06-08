package Assignment05;


import java.util.ArrayList;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {4000, 3000, 1000, 2000};
        System.out.println(average(arr));
    }

    public static double average(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int x= arr.length-2;
        double total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        total = total - (min + max);
        double avg = total / x;
        return avg;
    }


//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



