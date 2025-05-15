package Assignment05;


import java.lang.reflect.Array;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        System.out.println(isPerfectSquare(4));
    }

    public static boolean isPerfectSquare(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num ; j++) {
                if(i*j==num && i==j)
                {
                    return true;
                }
            }
        }
        return false;
    }






//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



