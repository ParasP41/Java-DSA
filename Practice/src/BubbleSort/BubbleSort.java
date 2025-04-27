package BubbleSort;
import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        sortBubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sortBubble(int[] arr)
    {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 1; j < arr.length-i; j++) {
                if(arr[j-1]>arr[j])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }
            }
                if(!swap)
                {
                    break;
                }
        }
//            System.out.println(Arrays.toString(arr));
    }
}
