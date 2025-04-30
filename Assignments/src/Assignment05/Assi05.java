package Assignment05;

import java.sql.Array;
import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
    }
    static int[] sumZero(int n)
    {
        int[] arr=new int[n];
        for (int i = 0,j=n-1; i <= j; i++,j--) {
            if(i==j)
            {
                arr[i]=0;
            }else
            {
                arr[i]=j;
                arr[j]=-j;
            }
        }
        return arr;
    }


}

