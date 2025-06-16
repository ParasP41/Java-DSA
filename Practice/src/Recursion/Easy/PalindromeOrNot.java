package Recursion.Easy;

public class PalindromeOrNot {
    public static void main(String[] args) {
        System.out.println(palin(12343));
    }

//    static boolean go(String str, int s, int e) {
//        if (s >= e) {
//            return true; // base case: all characters checked
//        }
//        if (str.charAt(s) != str.charAt(e)) {
//            return false; // mismatch found
//        }
//        return go(str, s + 1, e - 1); // check inner part
//    }

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
    static boolean palin(int n)
    {
        return n==revMethod2(n);
    }
}
