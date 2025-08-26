package Recursion.Level1Question;

public class ProudctOfDigits {
    public static void main(String[] args) {
        System.out.println(digits2(1234));
    }

    static int digits2(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * digits2(n / 10);
    }
}
