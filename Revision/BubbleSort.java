import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={2,4,3,1,5,6};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr) {
        boolean step=false;
        for (int i = 0; i < arr.length; i++) {
            step=false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if(j>0 && arr[j]<arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    step=true;
                }
            }if(!step)
            {
                break;
            }
        }
    }
}