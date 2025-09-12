package Assignment05;

import java.util.*;

class Assi05 {

    public static void main(String[] args) {
        System.out.println(maxRepeating("aaabaaaabaaabaaaabaaaabaaaabaaaaba","aaaba"));
    }
    public static int maxRepeating(String sequence, String word) {
        return count(sequence,word,0);
    }
    static int count(String sequence, String word,int sum)
    {
        if(sequence.isEmpty())
        {
            return sum;
        }
        if (sequence.startsWith(word)) {
            return count(sequence.substring(word.length()),word,sum+1);
        } else {
            return count(sequence.substring(1),word,sum);
        }
    }
}
