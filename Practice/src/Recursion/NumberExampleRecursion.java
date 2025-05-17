package Recursion;

public class NumberExampleRecursion {
    public static void main(String[] args) {
        number(1);
    }

    static void number(int n) {
        //base condition
        if (n == 5) {
            System.out.println(n);
            return;
        }
        System.out.println(n);
        //recursive call
        //If you call a function call again and again you can treat it as a separate call in the stack
        number(n + 1);
    }
}
