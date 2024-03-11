package BranchCoverage_exo1;

import LineCoverage_exo1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void mot_utiluser_isPalindrome() {
        assertEquals(true, BranchCoverage_exo1.Palindrome.isPalindrome("kayak"));
    }
    @Test
    void mot_pas_palindrome_test(){
        assertEquals(false, BranchCoverage_exo1.Palindrome.isPalindrome("papa"));

    }
    @Test
    public void testIsPalindromeWithNullString() {
        String s = null;
        assertThrows(NullPointerException.class, () -> BranchCoverage_exo1.Palindrome.isPalindrome(s));
    }

}