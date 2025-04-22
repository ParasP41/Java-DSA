package Assignment05;

import java.util.ArrayList;
import java.util.Arrays;

public class Assi05 {
    public static void main(String[] args) {

        int count=0;
        int[] arr={12,345,2,6,7896};
        for (int i = 0; i < arr.length; i++) {
            int even=0;
            int x=arr[i];
            while (x>0)
            {
                x=x/10;
                even++;
            }
            if(even%2==0)
            {
                count++;
            }

        }
        System.out.println(count);
    }

}




