public class BinarySearchAss {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(BinarySearchAssending(arr,6,0,arr.length-1));
    }
    static int BinarySearchAssending(int[] arr,int target,int start,int end)
    {
        while (start<=end) {
            int mid=start+(end-start)/2;
            if(target==arr[mid]){
                return mid;
            }else if(target>arr[mid])
            {
                start=arr[mid]+1;
            }else if(target<arr[mid])
            {
                end=arr[mid]-1;
            }
        }
        return -1;
    }
}
