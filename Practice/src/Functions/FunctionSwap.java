package Functions;

public class FunctionSwap {
    public static void main(String[] args) {
        int a = 2;
        int b = 4;
//        System.out.println(a+","+b);

        //swap number code
//        int temp=a;
//        a=b;
//        b=temp;

//        System.out.println(a+","+b);

        swap(a,b);
    }

    static void swap(int a, int b) {
        int temp=a;
        a=b;
        b=temp;

    }
}
