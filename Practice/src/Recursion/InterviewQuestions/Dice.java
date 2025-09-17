package Recursion.InterviewQuestions;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        System.out.println(diceRet("",3));
    }

    static void dice(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            dice(p + i, target - i);
        }
    }
    static void diceFace(String p, int target,int face) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(p + i, target - i,face);
        }
    }

    static ArrayList<String> diceRet(String p, int target) {
        if (target == 0) {
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> List=new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            List.addAll(diceRet(p + i, target - i));
        }
        return List;
    }

    static ArrayList<String> diceFaceRet(String p, int target,int face) {
        if (target == 0) {
            ArrayList<String> List=new ArrayList<>();
            List.add(p);
            return List;
        }
        ArrayList<String> List=new ArrayList<>();
        for (int i = 1; i <= face && i <= target; i++) {
            List.addAll(diceFaceRet(p + i, target - i,face));
        }
        return List;
    }
}
