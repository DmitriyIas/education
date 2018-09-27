package palindromeVerificationTest;

import org.junit.Test;
import palindromeVerification.PalindromeVerification;

import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class PalindromeVerificationTest {

    @Test
    public void testPositive(){
        assertTrue(PalindromeVerification.isPalindrome("ababa"));
    }

    @Test
    public void testNegative(){
        assertFalse(PalindromeVerification.isPalindrome("ababahdhg"));
    }

}
