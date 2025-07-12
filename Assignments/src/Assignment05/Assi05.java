package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[][] points = {{-17,13},{2,1},{8,-5},{18,-20}};
        int k = 26;
        System.out.println(findMaxValueOfEquation(points,k));

    }
    public static int findMaxValueOfEquation(int[][] arr, int k) {
        int max=0;
        for (int i = 0; i < arr.length-1; i++) {
            int firstSum=Math.abs(arr[i][0]-arr[i+1][0]);
            if(firstSum<=k)
            {
                int lastSum=arr[i][1]+arr[i+1][1];
                int totalSum=lastSum+firstSum;
                if(max<totalSum)
                {
                    max=totalSum;
                }
            }
        }
        return max;
    }
}


