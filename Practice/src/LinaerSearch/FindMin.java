package LinaerSearch;

public class FindMin {
    public static void main(String[] args) {
        int[] arr={18,12,7,4,12,34,2};
        System.out.println(min(arr));
    }
    static int min(int[] arr)
    {
//        int min=Integer.MAX_VALUE;
        int min=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(min>arr[i])
            {
                min=arr[i];
            }
        }
        return min;
    }
}
