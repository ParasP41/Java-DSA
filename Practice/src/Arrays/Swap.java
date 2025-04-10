package Arrays;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(1,3,arr);
    }
    static void swap(int a,int b,int[] arr)
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        System.out.println(Arrays.toString(arr));
    }
}
