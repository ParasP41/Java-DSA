package Assignment05;

import java.util.*;

class Assi05 {

    public static void main(String[] args) {
        System.out.println(countPrime(10000));

    }

    static int countPrime(int n) {
        int count=0;
        for (int i = 0; i < n; i++) {
            Boolean status=prime(i,);
            if (status)
            {
                count++;
            }
        }
        return count;
    }

    static boolean prime(int n,int x) {
        if (n <= 1) return false;
        int i = x;
        while (i * i <= n) {
            if (n % i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }

}
