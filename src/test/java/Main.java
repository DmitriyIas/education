import MinMaxAvgNumber.MinMaxAvgNumber;
import PalindromeVerification.PalindromeVerification;
import StringReverse.StringReverse;

public class Main {

    public static void main(String[] args) {

        PalindromeVerification palindrome = new PalindromeVerification();
        MinMaxAvgNumber number = new MinMaxAvgNumber();
        StringReverse line = new StringReverse();

        switch (Run.number){
            case palindrome:
                palindrome.verification();
                break;
            case number:
                number.minMaxAvgCalculation();
                break;
            case reverse:
                line.useReverse();
                break;
        }
    }

    public enum Run{
        palindrome,
        number,
        reverse
    }

}
