package Assignment05;

import java.util.*;

class Assi05 {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},

        };
        int r=1,c=1;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);
            }
        }
        int[][] newArr=new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                int x=c*i+j;
                if(x<list.size())
                {
                    newArr[i][j]=list.get(x);
                }else{
                    return ;
                }
            }
        }
        System.out.println(Arrays.deepToString(newArr));
    }
}

