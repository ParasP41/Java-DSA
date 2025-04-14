package LinaerSearch;

public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr={
                {2,4,3,65,6},
                {34,65,12,54},
                {34,3,84,2,67},
        };
        System.out.println(max(arr));
    }
    static int max(int[][] arr)
    {


        int max=Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(max<arr[i][j])
                {
                   max=arr[i][j];
                }
            }
        }
        return max;
    }
}
