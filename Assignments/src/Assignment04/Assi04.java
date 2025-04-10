package Assignment04;

import java.util.Scanner;

public class Assi04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //1
//        int a = in.nextInt();
//        int b = in.nextInt();
//        int c = in.nextInt();
//        System.out.println("max : " + max(a, b, c));
//        System.out.println("min : " + min(a, b, c));

        //2
//        int a = in.nextInt();
//        even_odd(a);

        //3
//        int age=in.nextInt();
//        System.out.println(vote(age));

        //4
//        int a=in.nextInt();
//        int b=in.nextInt();
//        System.out.println("sum : "+sum(a,b));

        //5
//        int a = in.nextInt();
//        int b = in.nextInt();
//        System.out.println("multiplication : " + mul(a, b));

        //6
//        int radius=in.nextInt();
//        circle(radius);

        //7
//        int num=in.nextInt();
//        prime(num);

        //8
//        int num=in.nextInt();
//        factorial(num);

        //9
//        int num = in.nextInt();
//        palendrom(num);

        //12
//        int a=in.nextInt();
//        int b=in.nextInt();
//        int c=in.nextInt();
//        triplet(a,b,c);

        //13

        //14
//        int num = in.nextInt();
//        System.out.println(sum_natural(num));
    }
    //1
//    static int max(int a, int b, int c) {
//        int p = 0;
//        if (a > b) {
//            p = a;
//        } else {
//            p = b;
//        }
//        if (p < c) {
//            p = p;
//        }
//
//        return p;
//    }
//    static int min(int x, int y, int z) {
//        int p = 0;
//        if (x > y) {
//            p = y;
//        }
//        if (p > z) {
//            p = z;
//        }
//        return p;
//    }

    //2
//    static void even_odd(int a) {
//        if (a < 0) {
//            System.out.println("Invalid Number");
//        } else if (a % 2 == 0) {
//            System.out.println("even no");
//        } else {
//            System.out.println("odd number");
//        }
//    }

    //3
//    static String vote(int age)
//    {
//        if(age<0)
//        {
//            return "invalid age";
//        }else if(age>18)
//        {
//            return "eligible to vote";
//        }else
//        {
//            return "not eligible to vote";
//        }
//    }

    //4
//    static int sum(int a,int b)
//    {
//        return a+b;
//    }

    //5
//    static int mul(int a, int b) {
//        return a * b;
//    }

    //6
//    static void circle(int radius)
//    {
//        double area=Math.PI*radius*radius;
//        double circumference=2*Math.PI*radius;
//        System.out.println("Area : "+area);
//        System.out.println("Circumference : "+circumference);
//    }

    //7
//    static void prime(int num)
//    {
//       for(int c=2;c<num;c++)
//       {
//           if(num%c==0)
//           {
//               System.out.println("not Prime");
//               return;
//           }
//           else {
//               System.out.println("prime");
//               return;
//           }
//
//       }
//    }

    //8
//    static void factorial(int num) {
//        int fact = 1;
//        if (num < 0) {
//            System.out.println("invalid number");
//        } else if (num == 1 || num == 0) {
//            System.out.println("factorial : " + fact);
//        } else {
//            for (int i = 2; i <= num; i++) {
//
//                fact *= i;
//            }
//            System.out.println(fact);
//        }
//    }

    //9
//    static void palendrom(int num) {
//        int ans = 0;
//        int num2=num;
//        while (num > 0) {
//            int rem = num % 10;
//            num /= 10;
//            ans = ans * 10 + rem;
//        }
//        if (ans == num2) {
//            System.out.println("palendrom number");
//        } else {
//            System.out.println("not a palendrom number");
//        }
//    }

    //12
//    static void triplet(int a, int b, int c) {
//        if (a * a + b * b == c * c) {
//            System.out.println("Pythagorean triplet");
//        } else {
//            System.out.println("Not a Pythagorean triplet");
//        }
//    }

    //13


    //14
//    static int sum_natural(int num) {
//        int sum = 0;
//        for (int i = 1; i <= num; i++) {
//            sum += i;
//        }
//        return sum;
//    }
}
