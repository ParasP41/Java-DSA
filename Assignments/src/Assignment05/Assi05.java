package Assignment05;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi05 {
    public static void main(String[] args) {
//        String str = "abcdefgh";
//        String check = "cde";
//        int target = 0;
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < check.length(); i++) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//                target = (int) ((char) check.charAt(i));
//                int mid = start + (end - start) / 2;
//                if (target > (int) (arr[mid])) {
//                    start = mid + 1;
//                } else if (target < (int) (arr[mid])) {
//                    end = mid - 1;
//                } else if (target == (int) (arr[mid])) {
//                    System.out.println(mid);
//                    return;
//                }
//            }
//        }

        int[] nums={1,2,3,4,0};
        int[] index={0,1,2,3,0};
        int[] target=new int[index.length];
        for (int i = 0; i < nums.length; i++) {
            target[i]=index[nums[i]];
        }
        System.out.println(Arrays.toString(target));

    }
}



