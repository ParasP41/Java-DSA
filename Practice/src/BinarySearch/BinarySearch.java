package BinarySearch;
//In Binary search the array must be sorted
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,10,11};
        System.out.println(binary(arr,11));
    }
    static int binary(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;

        while (start<=end)
//        while (true)
        {
//            int mid=(start+end)/2;//this will give us error of this extend the max value of integer
            int mid=start+(end-start)/10;//this is more optimize
            if(arr[mid]>target)
            {
                end=mid-1;
            } else if (arr[mid]<target) {
                start=mid+1;
            }else
            {
                return mid;
            }
        }
        return -1;
    }
}
