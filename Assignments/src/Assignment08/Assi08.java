package Assignment08;

import java.sql.Array;
import java.util.Arrays;

public class Assi08 {
    public static void main(String[] args) {
        System.out.println(mergeAlternately("abc","abc"));
    }

    public static String mergeAlternately(String word1, String word2) {
        String str = "";
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            str += word1.charAt(i);
            str += word2.charAt(i);
        }

        if (word1.length() > word2.length()) {
            str += word1.substring(word2.length());
        }

        if (word1.length() < word2.length()) {
            str += word2.substring(word1.length());
        }

        return str;
    }
}
