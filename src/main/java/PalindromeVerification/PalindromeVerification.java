package PalindromeVerification;

import java.util.Scanner;

public class PalindromeVerification {

    private StringBuilder word;

    public void verification() {
        PalindromeVerification verification = new PalindromeVerification();
        while (true) {
            verification.setWord();
            if (verification.word.toString().equals("exit")) {
                System.out.println("Exit programm.");
                break;
            }
            verification.isPalindromeCheck(verification.word);
        }
    }

    private void setWord() {
        boolean isEmptyCheck;
        do {
            System.out.println("Enter any word:");
            Scanner input = new Scanner(System.in);
            word = new StringBuilder(input.nextLine().toLowerCase().trim().replace(" ", ""));
            isEmptyCheck = word.toString().isEmpty();
        } while (isEmptyCheck);

    }

    private void isPalindromeCheck(StringBuilder word) {
        String word1 = word.toString();
        String word2 = word.reverse().toString();
        if (word1.equals(word2)) {
            System.out.println("IsPalindromeResult = TRUE ".concat("\n"));
        } else {
            System.out.println("IsPalindromeResult = FALSE".concat("\n"));
        }
    }


}
