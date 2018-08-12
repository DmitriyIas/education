package stringReverse;

import java.util.Scanner;

public class StringReverse {

    public static void useReverse() {
        String word = inputWord();
        System.out.println(wordReverse(word));
    }

    private static String inputWord() {
        System.out.println("Enter any word:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static String wordReverse(String word) {
        char[] wordArr = word.toCharArray();
        char[] wordArrReverse = new char[wordArr.length];
        for (int i = 0, j = wordArrReverse.length - 1; i < wordArr.length; i++) {
            wordArrReverse[j--] = wordArr[i];
        }
        return new String(wordArrReverse);

    }
}
