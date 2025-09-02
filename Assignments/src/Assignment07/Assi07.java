package Assignment07;

import java.util.*;

public class Assi07 {
    public static void main(String[] args) {
        int[] arr={3,30,34,5,9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] arr) {
        String total = "";
        String x = String.valueOf(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            String a = String.valueOf(arr[i]) + x;
            String b = x + String.valueOf(arr[i]);


            if (a.compareTo(b) > 0) {
                x = String.valueOf(arr[i]) + x;
            } else {
                x = x + String.valueOf(arr[i]);
            }
        }

        return x;
    }
}


