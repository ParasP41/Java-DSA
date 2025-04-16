package BinarySearch;

public class BinarySearchDecendingOrder {
    public static void main(String[] args) {
        int[] arr={90,80,70,60,50,40,30,20,10,1};
        System.out.println(binarySearch(arr,70));
    }
    static int binarySearch(int[] arr,int target)
    {
        int start=0;
        int end=arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/10;;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid]>target)
            {
                start=mid+1;
            }else if(arr[mid]<target){
                end=mid-1;
        }
        }
        return -1;
    }
}
