package LineCoverage_exo1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    void mot_utiluser_isPalindrome() {
        assertEquals(true, Palindrome.isPalindrome("kayak"));
    }
    @Test
    void mot_pas_palindrome_test(){
        assertEquals(false,Palindrome.isPalindrome("papa"));

    }
    @Test

     void testIsPalindromeWithNullString() {
        String s = null;
        assertThrows(NullPointerException.class, () -> Palindrome.isPalindrome(s));
    }
}