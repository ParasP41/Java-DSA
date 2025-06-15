public class Recursion {
    public static void main(String[] args) {
        // add(1);
        // System.out.println(fibo(7));
        int[] arr = { 1, 3, 5, 7, 9 };
        System.out.println(binary(arr, 0, arr.length, 3));
    }

    static void add(int n) {
        if (n == 5) {
            return;
        }
        System.out.println(n);
        add(n + 1);
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }

    static int binary(int[] arr,int start,int end,int target)
    {
       if(start>end)
       {
        return -1;
       }
       int mid=start+(end-start)/2;
       if(arr[mid]==target)
       {
        return mid;
       }
       if(arr[mid]>target)
       {
        return binary(arr, start, mid-1, target);
       }
    return binary(arr, mid+1, end, target);
    }
}
