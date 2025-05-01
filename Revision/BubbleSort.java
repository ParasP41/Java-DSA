import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={3,4,2,5,1};
        binSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void binSort(int[] arr)
    {
        boolean swap;
        for (int i = 0; i < arr.length; i++) {
            swap=false;
            for (int j = 0; j < arr.length-i; j++) {
                if(j>=1 && arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swap=true;
                }if(!swap)
                {
                    break;
                }
            }
        }
    }
}