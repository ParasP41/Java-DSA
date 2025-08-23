package StriverRecursion;

public class FactorialNumber {
    public static void main(String[] args) {
        System.out.println(fact(4));
        System.out.println(fact2(4, 1));
    }

    //1
    static int fact(int n) {
        if (n < 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    //2
    static int fact2(int n, int mul) {
        if (n < 1) {
            return mul;
        }

        return fact2(n - 1, mul *= n);
    }
}
