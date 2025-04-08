package Functions;

import java.util.Arrays;

//variable length arguments
public class Varargs {
    public static void main(String[] args) {

        fun(2,3,4,4,3,3,4,5,6,6);
        multi(2,3,4,4,4,4,4);
    }

    static void multi(int a,int b,int... v)
    {
        System.out.println(a+","+b+","+Arrays.toString(v));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}
