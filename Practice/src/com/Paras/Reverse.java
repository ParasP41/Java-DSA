package com.Paras;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number : ");
        int a=sc.nextInt();
        //Using String
//        String store="";
//        while(a>0)
//        {
//            int x=(a%10);
//            store=store+x;
//            a=a/10;
//        }
//        System.out.println(store);

        //using int
        int store=0;
        while(a>0)
        {
            int x=(a%10);
            store=store*10+x;
            a=a/10;
        }
        System.out.println(store);
    }
}
