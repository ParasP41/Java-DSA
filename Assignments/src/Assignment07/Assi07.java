package Assignment07;

import java.util.*;

public class Assi07 {
    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9};
        System.out.println(largestNumber(arr));
    }

    public static String largestNumber(int[] arr) {
        String total="";
        String[] numStrings = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            numStrings[i] = Integer.toString(arr[i]);
        }
        Arrays.sort(numStrings, (a, b) -> (b + a).compareTo(a + b));
        for (int i = 0; i < numStrings.length; i++) {
            total+=numStrings[i];
        }
        return total;
    }
}


