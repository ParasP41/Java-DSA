package Assignment03;

import java.util.Scanner;

public class Assi03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //###//Basic Java Programs
        //21

        //22
//        System.out.print("enter the number : ");
//        int num = sc.nextInt();
//        int sum=0;
//        int mul=1;
//        while(num>0)
//        {
//            sum+=num%10;
//            mul*=num%10;
//            num=num/10;
//        }
//        System.out.println("Sum : " sum);
//        System.out.println("multiply : "mul);

        //23
//        System.out.print("enter the number : ");
//        int num=sc.nextInt();
//        for(int i=1;i<=num;i++)
//        {
//            for(int j=num;j>=1;j--)
//            {
//                if(i*j==num)
//                {
//                    System.out.println(i+"*"+j+"="+num);
//                }
//            }
//        }

        //24
//        int a;
//        int sum=0;
//        while (true) {
//            System.out.print("enter the number a : ");
//            a = sc.nextInt();
//            if (a != 0) {
//                sum+=a;
//            } else {
//                break;
//            }
//        }
//        System.out.println(sum);int a;


        //25
//        int a;
//        int large=0;
//        while (true) {
//            System.out.print("enter the number a : ");
//            a = sc.nextInt();
//            if(a!=0)
//            {
//                if(a>large)
//                {
//                    large=a;
//                }
//            }
//            else
//            {
//                break;
//            }
//        }
//        System.out.println(large);


        //##//Intermediate Java Programs

        //1
//        int n = sc.nextInt();
//        int fact = 1;
//        if (n == 0) {
//            fact = 1;
//        } else {
//            for (int i = n; i >= 1; i--) {
//                fact*=i;
//            }
//        }
//        System.out.println(fact);


        //3
//        int n = sc.nextInt();
//        int sum=0;
//        double avg=0;
//        for (int i = 1; i <= n; i++) {
//            System.out.print("enter the number : ");
//            int num=sc.nextInt();
//            sum+=num;
//            avg=sum/n;
//        }
//        System.out.println(avg);


        //5
//        int a=sc.nextInt();
//        int b=sc.nextInt();
//        int c=sc.nextInt();
//        int d=sc.nextInt();
//        double sum=Math.sqrt(((a-b)*(a-b))+((c-d)*(c-d)));
//        System.out.println(sum);

        //6
//        int number=sc.nextInt();
//        int power=sc.nextInt();
//        int resut=1;
//        for(int i=1;i<=power;i++)
//        {
//            resut*=number;
//        }
//        System.out.println(resut);


        //13
//        int n=sc.nextInt();
//        int sum=0;
//        for (int i=1 ; i<=n ; i++){
//            sum+=i;
//        }
//        System.out.println(sum);

        //14
//        int n=sc.nextInt();
//        int n = 153;
//        for (int i = n; i > 0; i /= 10) {
//            System.out.println("armstrong");
//        }


        //15
//        System.out.print("enter the n : ");
//        int n = sc.nextInt();
//        System.out.print("enter the r : ");
//        int r = sc.nextInt();
//        double NPR = 1;
//        double NCR = 1;
//        int x = 1;
//        int y = 1;
//        int z = 1;
//        if (n == 0) {
//            NPR = 1;
//            NCR = 1;
//        } else if (n - r == 0 || n - r < 0) {
//            System.out.println("undefined");
//        } else {
//            for (int i = n; i >= 1; i--) {
//                x *= i;
//            }
//            for (int i = n - r; i >= 1; i--) {
//                y *= i;
//            }
//            for (int i = r; i >= 1; i--) {
//                z *= i;
//            }
//            NPR = x / y;
//            NCR = x / (z * y);
//            System.out.println(NPR + " " + NCR);
//        }

        //16
//        String str=sc.next();
//        String rev="";
//        for(int i=str.length()-1;i>=0;i--)
//        {
//            rev+=str.charAt(i);
//        }
//        System.out.println(rev);

        //17
//        int num = sc.nextInt();
//        int x=num;
//        int rev = 0;
//        int palendrom = 0;
//        while (x > 0) {
//            rev = x % 10;
//            palendrom = palendrom * 10 + rev;
//            x=x / 10;
//        }
//        if (num == palendrom) {
//            System.out.println("given number is palendrom");
//        } else {
//            System.out.println("Not a palendrom");
//        }


        //21
//        System.out.print("enter the character : ");
//        char ch=sc.next().trim().charAt(0);
//        switch (ch)
//        {
//            case 'a'-> System.out.println("Vowel");
//            case 'e'-> System.out.println("Vowel");
//            case 'i'-> System.out.println("Vowel");
//            case 'o'-> System.out.println("Vowel");
//            case 'u'-> System.out.println("Vowel");
//            default -> System.out.println("consonent");
//        }

        //22
//        int n = sc.nextInt();
//        int sum = 0;
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0 && i != n) {
//                sum += i;
//            }
//        }
//        if (sum == n) {
//            System.out.println("perfect number");
//        } else {
//            System.out.println("not a perfect number");
//        }

        //23
//        int year = sc.nextInt();
//        if (year > 0) {
//            if (year % 4 == 0) {
//                System.out.println("leap yaer");
//            }else if(year%100==0 && year%400==0)
//            {
//                System.out.println("leap yaer");
//            }
//            else {
//                System.out.println("Not a leap yaer");
//            }
//        } else {
//            System.out.println("invalid Year");
//        }


        //24
//        int num=sc.nextInt();
//        int x=num;
//        int y=0;
//        while (x>0)
//        {
//            y+=x%10;
//            x=x/10;
//        }
//        System.out.println(y);

        //25
//        int day=31;
//        int count=0;
//        for(int i=day;i>=1;i--)
//        {
//           if(i%2==0)
//           {
//               count++;
//           }
//        }
//        System.out.println(count);


    }

}
