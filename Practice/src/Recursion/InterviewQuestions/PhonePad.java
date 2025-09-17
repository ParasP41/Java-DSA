package Recursion.InterviewQuestions;
//https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        System.out.println(print2("","12"));
    }

    static void print(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; //this will convert the '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch=(char) ('a'+i);
            print(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> print1(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }

        int digit = up.charAt(0) - '0'; //this will convert the '2' into 2
            ArrayList<String> List=new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch=(char) ('a'+i);
            List.addAll(print1(p+ch,up.substring(1)));
        }
        return List;
    }

    static int print2(String p, String up) {
        if (up.isEmpty()) {
           return 1;
        }
        int count=0;
        int digit = up.charAt(0) - '0'; //this will convert the '2' into 2
        for (int i = (digit - 1) * 3; i < digit * 3; i++) {
            char ch=(char) ('a'+i);
           count=count+(print2(p+ch,up.substring(1)));
        }
        return count;
    }
}
