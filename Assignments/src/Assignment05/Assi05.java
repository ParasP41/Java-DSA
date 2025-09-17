package Assignment05;

import java.util.*;

class Assi05 {

    public static void main(String[] args) {
        String start = "L";
        String result = "X";
        System.out.println(canTransform(start, result));
    }

    public static boolean canTransform(String start, String result) {
        if (start.length() != result.length()) {
            return false;
        }

        StringBuilder a = new StringBuilder(start);
        StringBuilder b = new StringBuilder(result);
        for (int i = 0; i < a.length(); i++) {
                char x = a.charAt(i);
                char y = b.;
                if (x == y) {
                    a.deleteCharAt(a.indexOf(String.valueOf(x)));
                    b.deleteCharAt(b.indexOf(String.valueOf(y)));
                    break;
                }
            }
        }
        if (a.isEmpty())
        {
            return true;
        }
        return false;
    }
}
