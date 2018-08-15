package runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

import static min.max.avg.number.MinMaxAvgNumber.minMaxAvgCalculation;
import static palindrome.verification.PalindromeVerification.verification;
import static string.reverse.StringReverse.useReverse;

public class Runner {

    public static Logger logger = LoggerFactory.getLogger(Runner.class);

    public void getRun() {

        logger.info("Enter the number of exercise you want to run: \n1 - palindrome \n2 - number \n3 - reverse");
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
