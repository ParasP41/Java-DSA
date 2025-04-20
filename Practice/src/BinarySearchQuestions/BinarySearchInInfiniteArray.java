package BinarySearchQuestions;
//we can not use the .length beacuse the length of the arry is infinite

public class BinarySearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr={1,3,5,7,9,12,13,16,19,20,23,26,30};
        int target=19;
        System.out.println(findingRange(arr,target));
    }
    static int findingRange(int[] arr,int target)
    {
        int start=0;
        int end=1;
        while (target>arr[end])
        {
            int temp=end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }
        return search(arr,target,start,end);
    }
    static int search(int[] arr,int target,int start,int end)
    {
        while (start<=end)
        {
            int mid=start+(end-start)/2;
            if(target>arr[mid])
            {
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else
            {
                return mid;
            }
        }
        return -1;
    }
}
