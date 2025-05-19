package Assignment06;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi06 {
    public static void main(String[] args) {
        int[] arr = {3,3,7,7,10,11,11};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        for (int i = 0; i < arr.length; ) {
            int search = search(arr, arr[i]);
            if (search == 0) {
                if (arr[search] == arr[search + 1]) {
                    i++;
                }else {
                    return arr[search];
                }
            }
            if (search == arr.length - 1) {
                if (arr[search] == arr[search - 1]) {
                    i++;
                }else {
                    return arr[search];
                }
            }
            if (arr[search] == arr[search + 1] || arr[search] == arr[search - 1]) {
                i++;
            }else {
                return arr[search];
            }
        }
        return -1;
    }

    public static int search(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            ;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }


}
