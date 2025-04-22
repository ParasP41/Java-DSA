package BinarySearchQuestions;

public class SerachingInTheMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,2,1};
        System.out.println(search(arr,3));
    }

    static int search(int[] arr,int target)
    {
        int peak=mountain(arr);
        int firstTry=binary(arr,target,0,peak);
        if(firstTry!=-1)
        {
            return firstTry;
        }
        return binary(arr,target,peak,arr.length-1);
    }

    static int binary(int[] arr, int target,int start,int end) {
        boolean check = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 10;
            if (arr[mid] == target) {
                return mid;
            }
            if (check) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else if (arr[mid] > target) {
                    end = mid - 1;
                }
            } else if (!check) {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else if (arr[mid] > target) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
    static int mountain(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            }
        }
        return start;
    }
}
