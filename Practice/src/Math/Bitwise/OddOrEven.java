package Math.Bitwise;

public class OddOrEven {
    public static void main(String[] args) {
        int n = 70;
        System.out.println(check(n));
    }
    static boolean check(int n) {
        return (n&1)!=1;
    }
}
