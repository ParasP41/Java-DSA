package Assignment08;

import java.util.*;

public class Assi08 {

    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        rotate(arr);
    }

    public static void rotate(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=arr[j][i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int left = 0, right = arr[i].length - 1; left < right; left++, right--) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }

}




