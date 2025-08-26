package Recursion.Level1Question;

public class ReverseANumber {
    public static void main(String[] args) {
        re  verse1(1234);
        System.out.println(sum);
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
