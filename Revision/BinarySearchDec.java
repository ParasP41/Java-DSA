public class BinarySearchDec {

    public static void main(String[] args) {
        int[] arr={6,5,4,3,2,1};
        System.out.println(BinarySearchDecending(arr,6,0,arr.length-1));   
    }
    static int BinarySearchDecending(int[] arr,int target,int start,int end)
    {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target==arr[mid])
            {
                return mid;
            }else if(target>arr[mid])
            {
                end=mid-1;
            }else if(target<arr[mid])
            {
                start=mid+1;
            }
        }
        return -1;
    }
    
}