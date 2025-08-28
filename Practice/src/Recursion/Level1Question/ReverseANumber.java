package Recursion.Level1Question;

public class ReverseANumber {
    public static void main(String[] args) {
        System.out.println(reverse2(1234));
    }

    //1
    static int reverse(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int rev = n % 10;
        sum = (sum * 10) + rev;
        return reverse(n / 10, sum);
    }

    //2
    static int reverse2(int n) {
        int digit = (int) (Math.log10(n)) + 1;
        return helper(n, digit);
    }

    private static int helper(int n, int digit) {
        if (n % 10 == n) {
            return n;
        }
        int rem = n % 10;
        return rem * (int) Math.pow(10, digit - 1) + helper(n / 10, digit - 1);
    }

    //3
    static int sum = 0;

    static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rev = n % 10;
        sum = (sum * 10) + rev;
        reverse1(n / 10);
    }


}
