package CountSort;

import java.util.Arrays;
import java.util.HashMap;

public class CountSort {
    public static void main(String[] args) {
        int[] arr = {-5,2,-2};
        System.out.println(Arrays.toString(arr));
//        countSortArray(arr);
        countSortHasMap(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void countSortArray(int[] arr) { // using the arrays only
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            count[x] = count[x] + 1;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0){
                arr[index]=i;
                index++;
                count[i]--;
            }
        }

    }

    static void countSortHasMap(int[] arr){ // using the hashmap and handle the negative no also
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
            if (min > arr[i]){
                min = arr[i];
            }
        }

        int index = 0;
        for (int i = min; i <= max; i++) {
            if (map.containsKey(i)){
                int x = map.get(i);
                while (x > 0){
                    arr[index] = i;
                    index++;
                    x--;
                }
            }
        }
    }
}

