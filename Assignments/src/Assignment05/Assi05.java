package Assignment05;


import java.util.ArrayList;
import java.util.Arrays;

class Assi05 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3};
        System.out.println(thirdMax(arr));
    }

    public static int thirdMax(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                list.remove(arr[i]);
            }
        }
        if(list.size()==1)
        {
            return list.get(0);
        }else if(list.size()==2){
            return list.get(1);
        }
        return list.get(2);
    }



//    static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
//    }

}



