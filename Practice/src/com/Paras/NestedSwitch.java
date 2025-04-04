package com.Paras;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //old syntax
//        int empId = sc.nextInt();
//        String dep = sc.next();
//        switch (empId) {
//            case 1:
//                System.out.println("Pyiush");
//                break;
//            case 2:
//                System.out.println("Prince");
//                break;
//            case 3:
//                switch (dep) {
//                    case "cs":
//                        System.out.println("Computer Science");
//                        break;
//                    case "it":
//                        System.out.println("information technology");
//                        break;
//                    default:
//                        System.out.println("No dep enter ");
//                }
//                break;
//            default:
//                System.out.println("enter the correct emp and dep");
//        }


        //new syntax
        int empId = sc.nextInt();
        String dep = sc.next();
        switch (empId) {
            case 1 -> System.out.println("Pyiush");
            case 2 -> System.out.println("Prince");
            case 3 -> {
                System.out.println("emp no 3");
                switch (dep) {
                    case "cs" -> System.out.println("Computer Science");
                    case "it" -> System.out.println("information technology");
                    default -> System.out.println("No dep enter ");
                }
            }
            default -> System.out.println("enter the correct emp and dep");
        }


    }
}
