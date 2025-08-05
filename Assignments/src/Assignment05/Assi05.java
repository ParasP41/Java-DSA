package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[][] arr = {{1, 4}, {2, 3}, {3, 4}};
        System.out.println(findRightInterval(arr));
    }

    public static ArrayList findRightInterval(int[][] intervals) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < intervals.length; i++) {
            int var = -1;
            int last = intervals[i][1];
            for (int j = 0; j < intervals.length; j++) {
                if (i != j) {
                    int first = intervals[j][0];
                    if (last <= first) {
                        var = j;
                    }
                }
            }
            list.add(var);
        }
        return list;
    }
}


