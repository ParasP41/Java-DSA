package Assignment05;


import java.lang.reflect.Array;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        rotate(arr);
    }

    static void rotate(int[] arr) {
        int[] newArr = new int[arr.length];
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                continue;
            } else {
                sum *= arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
               int[] zeroArr=new int[arr.length];
               zeroArr[i]=sum;
                System.out.println(Arrays.toString(zeroArr));
                return;
            } else {
                newArr[i] = sum / arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));


    }

//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



