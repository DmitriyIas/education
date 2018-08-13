package palindromeVerification;

import java.util.Scanner;

public class PalindromeVerification {


    public static void verification() {

        String word = inputWord();
        while(!"exit".equals(word)) {
            String outputMessage = String.format("IsPalindromeResult = %s%n", Boolean.toString(isPalindrome(word)));
            System.out.println(outputMessage);
            word = inputWord();
        }
    }

    private static String inputWord() {
        System.out.println("Enter any word (To exit the program, type - exit) :");
        Scanner input = new Scanner(System.in);
        return input.nextLine().toLowerCase().trim().replace(" ", "");
    }


    private static boolean isPalindrome(String word) {
        boolean isPalindrome = true;
        char[] wordArr = word.toCharArray();
        for (int i = 0, j = wordArr.length-1; i < wordArr.length; i++){
            if (wordArr[i] != wordArr[j--]){
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }

}
