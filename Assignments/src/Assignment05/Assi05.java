package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[][] arr = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        setZeroes(arr);
        System.out.println(Arrays.deepToString(arr));
    }

    public static void setZeroes(int[][] matrix) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    list.add(new ArrayList<>());
                    list.get(row).add(i);
                    list.get(row).add(j);
                    row++;
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i).get(0);
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[n][j]=0;
            }
            int m = list.get(i).get(1);
            for (int j = 0; j < matrix.length; j++) {
                matrix[j][m]=0;
            }
        }
    }
}

