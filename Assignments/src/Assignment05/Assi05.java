package Assignment05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Assi05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //2


        //3
//        int[] arr = {1, 1, 1, 1, 1};
//        for (int i = 1; i < arr.length; i++) {
//            arr[i]=arr[i-1]+arr[i];
//        }
//        System.out.println(Arrays.toString(arr));

        //4
//        int[][] customer={
//                {1,2,3},
//                {4,6,7},
//                {9,6,7},
//                {1,6,7},
//                {10,6,7},
//        };
//        int[] sums=new int[customer.length];
//       for(int i=0;i<customer.length;i++)
//       {
//        int calc=0;
//           for (int j=0;j<customer[i].length;j++)
//           {
//               calc+=customer[i][j];
//           }
//           sums[i]=calc;
//       }
//        int x=Integer.MIN_VALUE;
//       for(int i=0;i< sums.length;i++)
//       {
//           if(x<sums[i])
//           {
//               x=sums[i];
//           }
//       }
//        System.out.println(x);


        //5
//        int[] arr={1,2,5,3,3,5,6};
//        System.out.println(Arrays.toString(arr));
//        int[] random=new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//        int x=(int)(Math.floor(Math.random()*arr.length));
//        random[i]=arr[x];
//        }
//        System.out.println(Arrays.toString(random));

        //6
//        int[] candies = {2, 5, 8, 4, 2};
//        int[] extCandies = new int[candies.length];
//        int extraCandies = 3;
//        boolean[] result = new boolean[candies.length];
//        for (int i = 0; i < candies.length; i++) {
//            extCandies[i] = candies[i] + 3;
//        }
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < candies.length; i++) {
//            if (candies[i] > max) {
//                max = candies[i];
//            }
//            if (extCandies[i] >= max) {
//                result[i] = true;
//            }
//        }
//        System.out.println(Arrays.toString(result));


        //8
//        int[] nums={6,5,4,8};
//        int[] fin=new int[nums.length];
//        for(int i=0;i<nums.length;i++)
//        {
//            int count=0;
//            for(int j=0;j<nums.length;j++)
//            {
//                if(nums[i]>nums[j])
//                {
//                    count++;
//                }
//            }
//            fin[i]=count;
//        }
//        System.out.println(Arrays.toString(fin));

        //9

    }
}
