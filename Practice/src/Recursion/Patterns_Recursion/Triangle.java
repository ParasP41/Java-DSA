package Recursion.Patterns_Recursion;

import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) {
//        tra1(4, 0);
//        tra2(4,0);

    }

    static void tra1(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print("x");
            tra1(r, c + 1);
        } else {
            System.out.println();
            tra1(r - 1, 0);
        }
    }

    static void tra2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (c < r) {
            tra2(r, c + 1);
            System.out.print("x");
        } else {
            tra2(r - 1, 0);
            System.out.println();
        }
    }




}
