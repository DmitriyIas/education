import MinMaxAvgNumber.MinMaxAvgNumber;
import PalindromeVerification.PalindromeVerification;
import StringReverse.StringReverse;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        getRun();
    }

    private static void getRun() {
        PalindromeVerification palindrome = new PalindromeVerification();
        MinMaxAvgNumber number = new MinMaxAvgNumber();
        StringReverse line = new StringReverse();
        System.out.println("Enter exercise you want to run: \n palindrome \n number \n reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if ("palindrome".equals(input)) {
            palindrome.verification();

        } else if ("number".equals(input)) {
            number.minMaxAvgCalculation();

        } else if ("reverse".equals(input)) {
            line.useReverse();

        }

    }
}
