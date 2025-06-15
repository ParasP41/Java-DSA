package Recursion.Intro_Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 2) + fibo(n - 1);

    }
}
