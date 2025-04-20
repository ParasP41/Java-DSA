package Assignment05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Assi05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        String str = "abcdefgh";
//        String check = "cde";
//        int target = 0;
//        char[] arr = str.toCharArray();
//        for (int i = 0; i < check.length(); i++) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//                target = (int) ((char) check.charAt(i));
//                int mid = start + (end - start) / 2;
//                if (target > (int) (arr[mid])) {
//                    start = mid + 1;
//                } else if (target < (int) (arr[mid])) {
//                    end = mid - 1;
//                } else if (target == (int) (arr[mid])) {
//                    System.out.println(mid);
//                    return;
//                }
//            }
//        }

//        String str = "feet";
//        System.out.println(checkPangram(str));


//
//    static boolean checkPangram(String sentence) {
//        char[] abc = new char[26];
//        for (int i = 0; i < abc.length; i++) {
//            char alpha = (char) ('a' + i);
//            abc[i] = alpha;
//        }
//        for (int i = 0; i < abc.length; i++) {
//            for (int j = 0; j < abc.length; j++) {
//                if (sentence.charAt(i) == abc[j]) {
//                    return true;
//                } else if (sentence.length() < 26) {
//                    return false;
//                }
//            }
//        }
//        return false;

        int sum=0;
        int[] arr={9,8,7,6,5,4,3,2,1,0};
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            sum=(sum*10)+(arr[i]);
        }
        sum+=1;
        int y=sum;
        while(y>0)
        {
            y/=10;
            count++;
        }
//        System.out.println(count);
        int[] up=new int[count];
        for (int i = up.length-1; i >= 0 ; i--) {
            int x=sum;
            x=x%10;
            up[i]=x;
            sum/=10;
        }
        System.out.println(Arrays.toString(up));
//        System.out.println(sum);

    }

}




