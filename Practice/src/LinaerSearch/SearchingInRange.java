package LinaerSearch;

public class SearchingInRange {
    public static void main(String[] args) {
        int[] nums = {1, 4, 3, 6, 4, 3, 5, 6};
        System.out.println(lineraSearch(nums, 6,2,5));
    }

    static int lineraSearch(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

}
