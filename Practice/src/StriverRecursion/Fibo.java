package StriverRecursion;

public class Fibo {
    public static void main(String[] args) {
        System.out.println(fibo(4));
    }
    static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        int last=fibo(n-1);
        int SecondLast=fibo(n-2);
        return last+SecondLast;
    }
}
