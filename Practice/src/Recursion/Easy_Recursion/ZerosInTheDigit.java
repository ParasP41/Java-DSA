package Recursion.Easy_Recursion;

public class ZerosInTheDigit {
    public static void main(String[] args) {
        System.out.println(zero3(123400));
    }

//    static int x = 0;
//
//    static void zero(int n) {
//        if (n == 0) {
//            return;
//        }
//        int y = n % 10;
//        if (y == 0) {
//            x++;
//        }
//        zero(n / 10);
//
//    }

//    static int zero1(int n, int count) {
//        if (n % 10 == n) {
//            return count;
//        }
//        int rem = n % 10;
//        if (rem == 0) {
//            return zero1(n / 10, count + 1);
//        }
//        return zero1(n / 10, count);

    static int zero3(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int count) {
        if (n == 0) {
            return count;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
