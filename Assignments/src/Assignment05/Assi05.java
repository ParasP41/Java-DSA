package Assignment05;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[][] arr={
                {1,1},
                {0,0}
        };
        mat(arr,2,3);
    }
    static void mat(int[][] arr,int m,int n)
    {
        int[][] newArr=new int[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j%2==0){
                    int x=arr[i][j];
                    for (int k = 0; k < n; k++) {
                        newArr[x][k]+=1;
                    }
                }
                else{
                    int x=arr[i][j];
                    for (int k = 0; k < m; k++) {
                        newArr[k][x]+=1;
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }

}



