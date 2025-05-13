package CyclicSort.CyclicSortQuestions;

import java.util.Arrays;

//https://leetcode.com/problems/set-mismatch/description/
public class SetMismatch {
    public static void main(String[] args) {
        int[] arr={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }
    public static int[] findErrorNums(int[] arr) {
        int i=0;
        while(i<arr.length)
        {
            int cor=arr[i]-1;
            if(arr[i]<=arr.length && arr[i]!=arr[cor])
            {
                int temp=arr[i];
                arr[i]=arr[cor];
                arr[cor]=temp;
            }else{
                i++;
            }
        }
        for(int j=0;j<arr.length;j++)
        {
            if(arr[j]!=j+1)
            {
                return new int[]{arr[j],j+1};
            }
        }
        return new int[]{-1,-1};
    }

}
