package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
//        int[] arr={2,3,4};
//        System.out.println(sum(8));
        sum(5);
    }
    static void sum(int n)
    {
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            list.add(i);
        }
        System.out.println(list);
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
