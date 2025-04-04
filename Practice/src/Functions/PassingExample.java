package Functions;

public class PassingExample {
    public static void main(String[] args) {
        String name="Paras";
        greet(name);
    }
    static void greet(String name)
    {
//        name="Prince";
        System.out.println(name);
    }
}

//1>pass by reference
//2>pass by value of the reference

//1>create another obj
//2>update the present obj