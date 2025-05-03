package Assignment05;

import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr={1,1,2};
        int sum=1;
        for (int i = 0; i < arr.length; i++) {
            if(i>0)
            {
                if(arr[i]!=arr[i-1])
                {
                    arr[sum]=arr[i];
                    sum++;
                }
            }
        }
        System.out.println(sum);
        System.out.println(Arrays.toString(arr));
    }
}



