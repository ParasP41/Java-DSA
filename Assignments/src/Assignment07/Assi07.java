package Assignment07;

import java.util.*;

public class Assi07 {
    public static void main(String[] args) {
        String[] arr={"abc","d"};
        System.out.println(String.join("",arr));
    }



    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
