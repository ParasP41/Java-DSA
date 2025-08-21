package Recursion.Intro_Recursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(series(4));
    }

    static int series(int n) {
        //base condition
        if (n < 2) {
            return n;
        }
        return series(n - 1) + series(n - 2);
    }
}
