package Functions;

public class Shadowing {
    static int x = 90;//this will be shadowed

    public static void main(String[] args) {
        System.out.println(x);//90
        int x; //class variable are shadowed by this
//        System.out.println(x); //error
        x=90; //cause shadowing starts from here when the variable initialised
        //scope will began when the value is initialised
        System.out.println(x);//40
        fun();
    }

    static void fun() {
        System.out.println(x);
    }
}
