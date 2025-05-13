package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char) ('a' + 3));
        System.out.println("a" + 1);//when a integer is added to a string it is converted into wrapper class
        //integer will convert in Integer that will call toString()
        //this is same as after a few steps : "a"+"1"

        System.out.println("Paras"+ new ArrayList<>());
//        System.out.println(new Integer(56)+new ArrayList<>()); //error
        //In java the operator + is only defined for primitives and when any one of these values is a string. And the result of that string expression will be string type
        System.out.println(new Integer(56)+" "+new ArrayList<>());

    }

}
