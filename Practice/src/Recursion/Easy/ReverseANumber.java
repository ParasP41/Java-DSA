package Recursion.Easy;

public class ReverseANumber {
    public static void main(String[] args) {
        revMethod1(321);
        System.out.println(sum);
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

    static void revMethod2(int n)
    {
        //sometimes you need some additional variable in the argument
        //in this case make another argument

    }
}
