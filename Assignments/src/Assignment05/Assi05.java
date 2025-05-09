package Assignment05;

import java.util.ArrayList;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 3, 3, 4};
        System.out.println(Arrays.toString(spiral(arr,3)));
    }

    static int[] spiral(int[] arr,int target) {
        int[] newArr={-1,-1};
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                newArr[0]=i;
                break;
            }
        }
        for (int i = arr.length-1; i >= 0 ; i--) {
            if(arr[i]==target)
            {
                newArr[1]=i;
                break;
            }
        }
        return newArr;
    }
}



