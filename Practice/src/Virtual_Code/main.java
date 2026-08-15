package Virtual_Code;

import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }
    public static int nthUglyNumber(int n) {
        int i = 1;
        int count = 0;
        int ugly = 0;

        while (count < n) {
            if (isUgly(i)) {
                ugly = i;   // store current ugly number
                count++;
            }
            i++;
        }

        return ugly;
    }

    public static boolean isUgly(int n) {
        if(n==0) return false;
        while (n % 2 == 0)
            n /= 2;
        while (n % 3 == 0)
            n /= 3;
        while (n % 5 == 0)
            n /= 5;

        return n == 1;
    }

}


