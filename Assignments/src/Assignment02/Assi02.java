package Assignment02;

import java.util.Scanner;

public class Assi02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //1
//        System.out.print("enter the value of a : ");
//        int a=sc.nextInt();
//        if(a%2==0)
//        {
//            System.out.println("it is a even number");
//        }
//        else if(a%3==0)
//        {
//            System.out.println("it is a odd number");
//        }
//        else
//        {
//            System.out.println("neither even nor odd");
//        }


        //2
//        System.out.print("enter the name : ");
//        String name=sc.nextLine();
//        System.out.println("Hello '"+name+"' Nice to meet you");

        //3
//        System.out.print("Enter the value of the principle : ");
//        int p=sc.nextInt();
//        System.out.print("Enter the value of the rate : ");
//        int r=sc.nextInt();
//        System.out.print("Enter the value of the time : ");
//        int t=sc.nextInt();
//        double si=(p*r*t)/100;
//        System.out.println("the simple interest is : "+si);

        //4
//        System.out.print("enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.print("enter the value of b : ");
//        int b = sc.nextInt();
//        System.out.print("enter the operation (+.-.*,/) : ");
//        char op = sc.next().charAt(0);
//        if (op == '+') {
//            System.out.println("sum : " + (a + b));
//        } else if (op == '-') {
//            System.out.println("sub : " + (a - b));
//        } else if (op == '*') {
//            System.out.println("multi : " + (a * b));
//        } else if (op == '/') {
//            System.out.println("div : " + (a / b));
//        }
//        else
//        {
//            System.out.println("invalid operation");
//        }

        //5
//        System.out.print("enter the value of a : ");
//        int a = sc.nextInt();
//        System.out.print("enter the value of b : ");
//        int b = sc.nextInt();
//        if (a > b) {
//            System.out.println("a is greater");
//        } else if (a == b) {
//            System.out.println("a and b are equal");
//        } else {
//            System.out.println("b is greater");
//        }


        //6
//        System.out.print("enter the rupee : ");
//        double rupee=sc.nextDouble();
//        double usd=rupee/85.80;
//        System.out.println("rupee in usd : "+usd);

        //7


        //8
//        System.out.print("enter the string : ");
//        String str = sc.nextLine();
//        String str2 = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            str2 += str.charAt(i);
//        }
////        if (str == str2)// checks memory references, not actual string content.
//        if (str.equals(str2)) {
//            System.out.println("given String is a palendrom");
//        } else {
//            System.out.println("given String is not a palendrom");
//        }

        //9
        int num = 153;
        int mul=1;
        int sum=0;
        while (num > 0) {
            int ele=num%10;
            mul*=ele;
            sum+=mul;
            num = num / 10;
        }
        System.out.println(sum);

    }
}
