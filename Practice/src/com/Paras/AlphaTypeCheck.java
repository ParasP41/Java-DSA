package com.Paras;

import java.util.Scanner;

public class AlphaTypeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //trim() to remove extra spaces
        char c = sc.next().trim().charAt(0);
        if (c >= 'A' && c <= 'Z') {
            System.out.println("Upper case");
        }
        else
        {
            System.out.println("Lower case");
        }

    }
}

