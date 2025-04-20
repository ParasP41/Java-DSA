package BinarySearchQuestions;

public class SmallesElementGreatherThenTheTarget {
    public static void main(String[] args) {
        char[] letter = {'c', 'f', 'j'};
        System.out.println(letter(letter, 'j'));
    }

    static char letter(char[] letter, char target) {
        if ((int) (target) >= (int) (letter[letter.length - 1])) {
            return letter[0];
        }  else {

            int start = 0;
            int end = letter.length - 1;
            while (start <= end) {
                int mid = start + (end - start) / 2;
                if ((int) (target) > (int) (letter[mid])) {
                    start = mid + 1;
                } else if ((int) (target) < (int) (letter[mid])) {
                    end = mid - 1;
                } else {
                    return letter[mid + 1];
                }
            }
            return letter[start];
        }
    }
}
