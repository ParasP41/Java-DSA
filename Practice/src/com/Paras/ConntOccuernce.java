package com.Paras;

import java.util.Scanner;
public class ConntOccuernce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the value of num : ");
        int num=sc.nextInt();
        System.out.print("enter the value you want to count appernce of : ");
        int x=sc.nextInt();
        int count=0;
        while (num>0)
        {
            if(num%10==x)
            {
                count++;
            }
         num=num/10;
        }
        System.out.println(count);

    }
}
