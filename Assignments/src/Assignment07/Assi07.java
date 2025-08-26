package Assignment07;

import java.util.*;

public class Assi07 {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(8));
    }
    public static int arrangeCoins(int n) {
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
        int x=0;
        int sum=0;
        while(n>0 && x<arr.length)
        {
            if(n>=arr[x])
            {
                sum++;
                n-=arr[x];
            }
            x++;
        }
        return sum;
    }
}


