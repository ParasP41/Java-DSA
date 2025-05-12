package CyclicSort.CyclicSortQuestions;

import java.util.*;

public class FindAllDuplicateElements {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDuplicate(arr));
    }

    //first approach
//    public static List<Integer> findDuplicate(int[] arr) {
//        ArrayList<Integer> list=new ArrayList<>();
//        int i=0;
//        while(i<arr.length)
//        {
//            int cor=arr[i]-1;
//            if(arr.length>=arr[i] && arr[i]!=arr[cor])
//            {
//                int temp=arr[i];
//                arr[i]=arr[cor];
//                arr[cor]=temp;
//            }else{
//                i++;
//            }
//        }
//        for (int j = 0; j < arr.length; j++) {
//            if(j!=arr[j]-1)
//            {
//                list.add(arr[j]);
//            }
//        }
//        return list;
//    }

    //second approach
    public static List<Integer> findDuplicate(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            int cor = arr[i] - 1;
            if (arr.length >= arr[i] && arr[i] != arr[cor]) {
                int temp = arr[i];
                arr[i] = arr[cor];
                arr[cor] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                list.add(arr[j]);
            }
        }
        return list;
    }
}
