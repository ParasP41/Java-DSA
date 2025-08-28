package Recursion.Level1Question;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class StepToReduceNumberToZero {
    public static void main(String[] args) {
        System.out.println(count(14, 0));
    }

    static int count(int n, int c) {
        if (n == 0) {
            return c;
        }
        if (n % 2 == 0) {
            return count(n / 2, c + 1);
        }
        return count(n - 1, c + 1);
    }
}
