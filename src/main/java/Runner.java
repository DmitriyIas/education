import java.util.Scanner;
import static minMaxAvgNumber.MinMaxAvgNumber.minMaxAvgCalculation;
import static palindromeVerification.PalindromeVerification.verification;
import static stringReverse.StringReverse.useReverse;

class Runner {
    void getRun() {

        System.out.println("Enter the number of exercise you want to run: \n1 - palindrome \n2 - number \n3 - reverse");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        if ("1".equals(input)) {
            verification();

        } else if ("2".equals(input)) {
            minMaxAvgCalculation();

        } else if ("3".equals(input)) {
            useReverse();

        }

    }
}
