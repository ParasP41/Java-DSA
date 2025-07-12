public class index {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,8,10,11};
        System.out.println(binary(arr, 10));
    }
    static int binary(int[] arr,int target)
    {
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid=start+(end-start)/10;
            if(arr[mid]==target)
            {
                return mid;
            }else if(arr[mid]<target)
            {
                start=mid+1;
            }else if(arr[mid]>target)
            {
                end=mid-1;
            }
        }
        return -1;
    }

}
