package Assignment05;

import java.util.ArrayList;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4};
//        sort(arr);
        System.out.println(findKthLargest(arr,2));
//        System.out.println(Integer.toBinaryString(3));
    }

    public static int findKthLargest(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int max=0;
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        while (k > 0) {
            max = Integer.MIN_VALUE;
            for (int j = 0; j < list.size(); j++) {
                if (max < arr[j]) {
                    max = arr[j];
                }
            }
            if(k==1)
            {
                break;
            }
            list.remove(max);
            k--;
        }
        return max;
    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] < arr[j]) {
                    swap(arr, j, j - 1);
                }
            }
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
