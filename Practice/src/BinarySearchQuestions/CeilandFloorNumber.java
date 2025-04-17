package BinarySearchQuestions;

//ceil-->just greatest element or equal
//floor-->Just Smallest element or equal
public class CeilandFloorNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 10, 11, 15};
        System.out.println("ceil value would be : " + ceil(arr, 13));
        System.out.println("Floor value would be : " + floor(arr, 6));
        //ans-15
    }

    static int ceil(int[] arr, int target) {

        if(target>arr[arr.length-1])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[start];

    }

    static int floor(int[] arr, int target) {
        if(target< arr[0])
        {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return arr[end];
    }
}
