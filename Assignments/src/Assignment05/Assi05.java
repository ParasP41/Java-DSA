package Assignment05;

import java.util.*;

class Assi05 {

    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        System.out.println(Arrays.deepToString(merge(arr)));
    }

    public static int[][] merge(int[][] arr) {
        List<List<Integer>> list = new ArrayList<>();


//        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        for (int i = 0; i < arr.length; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            // ✅ check next intervals if overlapping
            while (i < arr.length - 1 && end >= arr[i + 1][0]) {
                end = Math.max(end, arr[i + 1][1]);
                i++;
            }

            list.add(Arrays.asList(start, end));
        }
        int[][] merge = new int[list.size()][];

        for (int i = 0; i < list.size(); i++) {
            merge[i] = new int[list.get(i).size()];

            for (int j = 0; j < list.get(i).size(); j++) {
                merge[i][j] = list.get(i).get(j);
            }
        }
        return merge;
    }

}
