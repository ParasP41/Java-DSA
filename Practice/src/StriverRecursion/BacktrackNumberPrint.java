package StriverRecursion;

public class BacktrackNumberPrint {
    public static void main(String[] args) {
        number(3);
    }
    static void number(int n)
    {
        if(n<1)
        {
            return;
        }
        number(n-1);
        System.out.println(n);
    }
}
