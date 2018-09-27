package palindromeVerificationTest;

import org.junit.Test;
import palindromeVerification.PalindromeVerification;

import static junit.framework.TestCase.assertTrue;

public class PalindromeVerificationTest {

    @Test
    public void testPalindrome(){
        assertTrue(PalindromeVerification.isPalindrome("ababa"));
    }

}
