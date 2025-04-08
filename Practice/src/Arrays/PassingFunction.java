package Arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,3,4};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr)
    {
        arr[0]=99;
    }
}
