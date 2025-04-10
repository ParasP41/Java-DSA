package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimentionalArray {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /*
        1 2 3
        4 5 6
        7 8 9
         */

//        int[][] arr=new int[3][]; (row*col)
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9},
//        };
//        int[][] arr = {
//                {1, 2, 3},
//                {4, 5},
//                {7, 8, 9, 10},
//        };

        //input
        int[][] arr=new int[3][3];
        System.out.println(arr.length); //this will give me no of rows
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=in.nextInt();
            }
        }

//        output
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for(int[] a: arr) //for each loop for the 2d array
        {
            System.out.println(Arrays.toString(a));
        }


    }

}
