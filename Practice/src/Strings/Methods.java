package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name="Paras Vishwakarma";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.indexOf('a'));
        System.out.println(name.lastIndexOf('a'));
        System.out.println(name.contains("a"));
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
