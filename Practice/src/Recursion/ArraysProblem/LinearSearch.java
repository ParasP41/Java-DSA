package Recursion.ArraysProblem;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3, 2, 6, 3, 4, 23, 2};
        ArrayList<Integer> Link = new ArrayList<>();
        System.out.println(find4(0, arr, 3));
    }

    //1
    static int find(int i, int[] arr, int target) {
        if (i > arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i;
        }
        return find(i + 1, arr, target);
    }

    //2
    static boolean find1(int i, int[] arr, int target) {
        if (i > arr.length - 1) {
            return false;
        }
        return arr[i] == target || find1(i + 1, arr, target);
    }

    //3
    static ArrayList<Integer> list = new ArrayList<>();

    static void find2(int i, int[] arr, int target) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            list.add(i);
        }
        find2(i + 1, arr, target);
    }

    //4
    static ArrayList<Integer> find3(int i, int[] arr, int target, ArrayList<Integer> Link) {
        if (i == arr.length) {
            return Link;
        }
        if (arr[i] == target) {
            Link.add(i);
        }
        return find3(i + 1, arr, target, Link);
    }

    //5
    static ArrayList<Integer> find4(int i, int[] arr, int target) {
        ArrayList<Integer> Link = new ArrayList<>();
        if (i == arr.length) {
            return Link;
        }
        if (arr[i] == target) {
            Link.add(i);
        }
        ArrayList<Integer> belowAnswers = find4(i + 1, arr, target);
        Link.addAll(belowAnswers);
        return Link;
    }

}
