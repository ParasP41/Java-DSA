package Opps.StaticExample;

public class Main {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human Rahul = new Human(34, "Rahul", 15000, true);
        System.out.println(kunal.name);
        System.out.println(Human.population);

//        greating();

    }

    //This is not dependent on object
    static void fun() {
        greating(); //you can not use this because it requires an instance
        //but the func you are using it in does not depend on instances
    }

    //we know that something that is not static that is belong to the object
    void greating() {
//        fun();
        System.out.println("Hellow World");
    }
}
