import java.util.Arrays;

public class Solution {
    public static int[][] transpose(int[][] arr) {
        int[][] newArr = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                    newArr[i][j]=arr[j][i];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
        };
        System.out.println(Arrays.toString(transpose(arr)));
    }
}