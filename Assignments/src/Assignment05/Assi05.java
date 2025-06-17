package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        System.out.println(rob(arr));
    }
    public static int rob(int[] arr) {
        int even = 0;
        int odd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                even += arr[i];
            } else {
                odd += arr[i];
            }
        }
        int max=Integer.MIN_VALUE;
        for(int i=0,j=arr.length-1;i<(arr.length-1)/2;i++,j--)
        {
            if(arr[i]+arr[j]>max)
            {
                max=arr[i]+arr[j];
            }
        }
        int x=Math.max(even,odd);
        return Math.max(x,max);
    }



//    static void sort1(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            for (int j = i; j > 0; j--) {
//                if (arr[j - 1] < arr[j]) {
//                    swap(arr, j, j - 1);
//                }
//            }
//        }
//    }

//    static void swap1(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }
}
