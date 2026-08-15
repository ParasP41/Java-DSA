package Codes;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(subset("","abc"));
    }


    static void print(int i, int j, int[][] arr) {
        if (i == arr.length - 1 && j == arr.length - 1) {
            System.out.println(arr[i][j]);
            return;
        }
        System.out.println(arr[i][j]);
        if (j < arr.length - 1) {
            print(i, j + 1, arr);
        } else {
            print(i + 1, 0, arr);
        }
    }
    static void path(String up,int i, int j) {

        if (i==1 && j==1) {
            System.out.println(up);
            return;

        }
        if (i>1){
            path(up+'D',i-1,j);
        }
//        if (j>1 && i>1){
//            path(up+'M',i-1,j-1);
//        }
        if (j>1){
            path(up+'R',i,j-1);
        }
    }
    public static int uniquePaths(int m, int n) {
        if (m==1 && n==1){
            return 1;
        }
        int left=0;
        int right=0;
        if (m>1){
            left=uniquePaths(m-1,n);
        }
        if (n>1){
           right= uniquePaths(m,n-1);
        }
        return left+right;
    }
    public static void backtrack(String p, int i, int j, boolean[][] arr) {

        if (i == arr.length - 1 && j == arr[0].length - 1) {
            System.out.println(p);
            return;
        }

        if (!arr[i][j]) {
            return;
        }

        arr[i][j] = false;

        if (i < arr.length - 1) {
            backtrack(p + 'D', i + 1, j, arr);
        }

        if (j < arr[0].length - 1) {
            backtrack(p + 'R', i, j + 1, arr);
        }

        if (i > 0) {
            backtrack(p + 'U', i - 1, j, arr);
        }

        if (j > 0) {
            backtrack(p + 'L', i, j - 1, arr);
        }

        arr[i][j] = true;
    }

    static ArrayList<Integer> paths(int i, int j, int[][] arr, ArrayList<Integer> list, int sum) {

        // add current cell
        sum *= arr[i][j];

        // base case
        if (i == arr.length - 1 && j == arr[0].length - 1) {
            list.add(sum);
            return list;
        }

        // down
        if (i < arr.length - 1) {
            paths(i + 1, j, arr, list, sum);
        }

        // right
        if (j < arr[0].length - 1) {
            paths(i, j + 1, arr, list, sum);
        }

        return list;
    }

    public static ArrayList<String> subset(String up, String p) {
        if (p.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(up);
            return list;
        }
        char ch = p.charAt(0);
        ArrayList<String> a = subset(up + ch, p.substring(1));
        ArrayList<String> b = subset(up, p.substring(1));
        a.addAll(b);
        return a;
    }

    public static List<List<Integer>> subsets(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        subsetHelper(arr, 0, new ArrayList<>(), result);
        return result;
    }

    private static void subsetHelper(int[] arr, int idx, List<Integer> current, List<List<Integer>> result) {
        if (idx == arr.length) {
            result.add(new ArrayList<>(current));  // add a copy of current subset
            return;
        }
        for (int i = 0; i < arr.length; i++) {

        }
    }
}
 