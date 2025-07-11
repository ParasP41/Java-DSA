package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[] arr={1,2,0,4,0};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
    }

    public static int[] productExceptSelf(int[] arr) {
        int[] num=new int[arr.length];
        int mul = 1;
        for (int i = 0; i < arr.length; i++) {
            mul *= arr[i];
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                int x=1;
                for (int j = 0; j < arr.length; j++) {
                    if(i!=j)
                    {
                        x*=arr[j];
                    }
                    num[i]=x;
                }
            }else{
                num[i]=mul/arr[i];
            }
        }
        return num;
    }
}

