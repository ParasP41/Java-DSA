package Recursion.Easy_Recursion;

public class NTo1 {
    public static void main(String[] args) {
//        print(5);
//        printRev(5);
        printBoth(5);
    }

    static void print(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }

    static void printRev(int n) {
        if (n == 0) {
            return;
        }
        printRev(n - 1);
        System.out.println(n);
    }
    static void printBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        printBoth(n - 1);
        System.out.println(n);
    }
}
