public class Pct {
    public static void main(String[] args) {
        System.out.println(speed(2, 4));
        deep("abc", 2);
    }

    static int speed(int a, int b) {
        if (b < 1) {
            return a / 2;
        }
        return a * speed(a, b - 1);
    }

    static void deep(String str, int n) {
        String str1 = "";
        if (n == 0) {
            System.out.println(str1);
            return;
        }
        str1 += str.charAt(n);
        deep(str, n - 1);
    }
}