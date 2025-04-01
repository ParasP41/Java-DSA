package com.Paras;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
//        int max=c;
//        if(a>max)
//        {
//            max=a;
//        }
//        if(b>max)
//        {
//            max=b;
//        }
//        System.out.println(max);

        int max = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);

//        int x=Math.max(c,Math.max(a,b));
//        System.out.println(x);

    }
}
