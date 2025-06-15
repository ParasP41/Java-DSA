package Recursion.Easy;

public class Sum {
    public static void main(String[] args) {
        System.out.println(N(4));
    }
    static int N(int n)
    {
        if (n <= 1) {
            return 1;
        }
        return n + N(n-1);
    }
}
