package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList01 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//Syntax
        ArrayList<Integer> list = new ArrayList<>(10);
//         list.add(67);
//         list.add(69);
//         list.add(90);
//         list.add(68);
//        System.out.println(list);
//        System.out.println(list.contains(67));
//        list.set(0,45);
//        list.remove(2);
//        System.out.println(list);
        
        //input
        for (int i = 0; i < 5; i++) {
//            int a=in.nextInt();
//            list.add(a);
            list.add(in.nextInt());
        }
        //get item of the any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] do not work here
        }
//        System.out.println(list);
    }
}
