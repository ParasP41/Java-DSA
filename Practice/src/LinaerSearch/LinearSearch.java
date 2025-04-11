package LinaerSearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 6, 4, 3, 5, 6};
        System.out.println(lineraSearch(nums, 6));
    }

    static int lineraSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
