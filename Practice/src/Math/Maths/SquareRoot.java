package Math.Maths;

public class SquareRoot {
    public static void main(String[] args) {
        int n = 40;
        int p = 3;
        System.out.println(root(n, p));
    }

    static double root(int n, int p) {
        int start = 0;
        int end = n;
        double rt = 0.0;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        double inc = 0.1;
        for (int i = 0; i < p; i++) {
            while (rt * rt < n) {
                rt += inc;
            }
            rt-=inc;
            inc/=10;
        }
        return rt;
    }
}
