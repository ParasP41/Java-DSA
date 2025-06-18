package Recursion.Arrays_Recursion;

import java.util.ArrayList;

public class SearchInArrays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 5, 6};
//        search(arr,0,7);
//        System.out.println(serach2(arr, 5, 0));
//        findAllIndex(arr,5,0);
//        System.out.println(list);
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(findAllIndex1(arr,5,0,list));
        System.out.println(findAllIndex2(arr,5,0));
    }

//    static void search(int[] arr, int i, int target) {
//        if (arr.length == i) {
//            System.out.println("Not Found");
//            return;
//        }
//        if (arr[i] == target) {
//            System.out.println("Found at index "+(i+1));
//            return;
//        }
//        search(arr, i + 1, target);

    static boolean serach1(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return false;
        }
        return arr[i] == target || serach1(arr, target, i + 1);
    }

    static int serach2(int[] arr, int target, int i) {
        if (i == arr.length - 1) {
            return -1;
        }
        if (arr[i] == target) {
            return i + 1;
        }
        return serach2(arr, target, i + 1);
    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findAllIndex(int[] arr, int target, int index) {
//        if (arr.length == index) {
//            return;
//        }
//        if (arr[index] == target) {
//            list.add(index + 1);
//        }
//        findAllIndex(arr, target, index + 1);
//    }

//    static  ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
//        if (arr.length == index) {
//            return list;
//        }
//        if (arr[index] == target) {
//            list.add(index + 1);
//        }
//        return findAllIndex1(arr, target, index + 1,list);
//    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if (arr.length == index) {
            return list;
        }
        //this will contain answer of that function call only
        if (arr[index] == target) {
            list.add(index + 1);
        }
        ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, target, index + 1);
        list.addAll(ansFromBelowCalls);
        return list;
    }
}
