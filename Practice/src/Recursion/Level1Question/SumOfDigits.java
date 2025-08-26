package Recursion.Level1Question;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(digits2(123));
    }

    //1
    static int digits(int n, int sum) {
        if (n == 0) {
            return sum;
        }
        int x = n % 10;
        return digits(n / 10, sum += x);
    }

    //2
    static int digits2(int n) {
        if (n == 0) {
            return 0;
        }
        return (n%10)+digits2(n/10);
    }

}
