package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
        int[] arr = {1,1};
        int[] arr1 = {1,2};
        System.out.println(arrangeCoins(5));
    }

    public static int arrangeCoins(int n) {
        int k=Math.ceilDiv(n,2);
        int[] arr=new int[k];
        for (int i = 0; i < k; i++) {
            arr[i]=i+1;
        }
        int count=0;
        int x=0;
        for (int i = arr.length-1; i >=0 ; i--) {
            if(count<n)
            {
                count+=arr[i];
                x++;
            }
        }
        return x;
    }


//    public static int search(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            ;
//            if (target == arr[mid]) {
//                return mid;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }


}
