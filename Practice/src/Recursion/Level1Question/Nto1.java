package Recursion.Level1Question;

public class Nto1 {
    public static void main(String[] args) {
//        print(4);
        printRev(4);
    }

    static void print(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        print(n - 1);
    }
    static void printRev(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printRev(n - 1);
        System.out.println(n);
    }
}
