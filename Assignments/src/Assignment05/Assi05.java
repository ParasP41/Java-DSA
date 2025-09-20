package Assignment05;

import java.util.*;

class Assi05 {

    public static void main(String[] args) {
        int n = 6;
        int index = 1;
        int maxSum = 10;
        System.out.println(maxValue(n, index, maxSum));
    }

    public static int maxValue(int n, int index, int maxSum) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == index) {
                nums[index] = maxSum - n + 1;  // put max possible at index
            } else {
                nums[i] = 1;  // fill others with 1
            }
        }
        return arr(nums, index);
    }

    static int arr(int[] nums, int index) {
        boolean leftOk = (index == 0) || Math.abs(nums[index] - nums[index - 1]) <= 1;
        boolean rightOk = (index == nums.length - 1) || Math.abs(nums[index] - nums[index + 1]) <= 1;

        if (leftOk && rightOk) {
            return nums[index];
        }

        nums[index] -= 1;
        return arr(nums, index);
    }
}
