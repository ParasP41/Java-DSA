package SearchingInMatrix;

import java.util.*;
public class BinarySearchIn2D {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }

    static int[] binarySerach(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart) / 2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            } else if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        if (row == 1) {
            return binarySerach(matrix, 0, 0, col - 1, target);
        }
        int rStart = 0;
        int rend = row - 1;
        int cMid = col / 2;
        while (rStart < (rend - 1)) {
            int mid = rStart + (rend - rStart) / 2;
            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            } else if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rend = mid;
            }
        }
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        } else if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        if (target <= matrix[rStart][cMid] - 1) {
            return binarySerach(matrix, rStart, 0, cMid - 1, target);
        } if (target >= matrix[rStart][cMid] + 1 && target <= matrix[rStart][cMid] + 1) {
            return binarySerach(matrix, rStart, cMid + 1, col - 1, target);
        } if (target <= matrix[rStart + 1][cMid] - 1) {
            return binarySerach(matrix, rStart+1, 0, cMid - 1, target);
        } else {
            return binarySerach(matrix, rStart+1, cMid+1, col- 1, target);
        }
    }
}
