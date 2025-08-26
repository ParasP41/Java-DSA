package Recursion.Level1Question;

public class Concept {
    public static void main(String[] args) {
        speed(4);
    }

    static void speed(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
//        speed(n--);
        speed(--n);
//        n-- vs --n
    }
}
