package string.reverse;

import java.util.Scanner;

import static runner.Runner.LOGGER;

public class StringReverse {

    private StringReverse(){}

    public static void useReverse() {
        String wordReverse = wordReverse(inputWord());
        LOGGER.info(wordReverse);
    }

    private static String inputWord() {
        LOGGER.info("Enter any word:");
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

    private static String wordReverse(String word) {
        char[] wordArr = word.toCharArray();
        char[] wordArrReverse = new char[wordArr.length];
        for (int i = 0, j = wordArrReverse.length - 1; i < wordArr.length; i++, j--) {
            wordArrReverse[j] = wordArr[i];
        }
        return new String(wordArrReverse);

    }
}
