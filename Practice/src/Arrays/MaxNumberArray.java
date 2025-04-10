package Arrays;

import java.util.Arrays;

public class MaxNumberArray {
    public static void main(String[] args) {
        int[] arr = {1, 12, 3, 4, 5, 6};
        System.out.println(max(arr));
    }

    static int max(int[] arr) {

        //first Logic
//       int max=Integer.MIN_VALUE;
//        for (int i = 0; i < arr.length; i++) {
//            if(max<arr[i])
//            {
//                max=arr[i];
//            }
//        }
//        return max;

        //second logic
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
       if(arr[i]>max)
       {
           max=arr[i];
       }
        }
        return max;
    }
}
