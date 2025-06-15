package Recursion.Easy;

public class ProductOfDigits {
    public static void main(String[] args) {
        System.out.println(pro(22));
    }
    static int pro(int n)
    {
//        if (n%10 == n) {
//            return n;
//        }
        if(n==0)
        {
            return 1;
        }
        return n % 10 * pro(n / 10);
    }
}
