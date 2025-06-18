package Recursion.Easy_Recursion;

public class ReverseANumber {
    public static void main(String[] args) {
//        revMethod1(321);
//        System.out.println(sum);
        System.out.println(revMethod2(321));
    }

    static int sum = 0;

    static void revMethod1(int n) {
        if (n == 0) {
            return;
        }
        int remender = n % 10;
        sum = sum * 10 + remender;
        revMethod1(n / 10);
    }

    static int revMethod2(int n) {
        //sometimes you need some additional variable in the argument
        //in this case make another argument
        int digits = (int) (Math.log10(n)) + 1;
        return helper(n, digits);
    }

    static int helper(int n, int digits) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return (int) (rem * Math.pow(10, digits - 1) + helper(n / 10, digits - 1));
    }
}
