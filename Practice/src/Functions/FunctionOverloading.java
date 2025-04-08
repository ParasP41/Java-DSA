package Functions;

public class FunctionOverloading {
    public static void main(String[] args) {

        fun(2,33);
        fun(43);
    }
    static void fun(int a)
    {
        System.out.println(a);
    }
    static void fun(int b,int c)
    {
        System.out.println(b+","+c);
    }
}
