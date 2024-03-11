package LineCovrage_exo2;

import LineCoverage_exo1.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {

    @Test
    void isanagram_true() {
        assertEquals(true,Anagram.isAnagram("papa","apap"));
    }
    @Test
    void isanagrame_false(){
        assertEquals(false,Anagram.isAnagram("papa","apap"));

    }
    @Test
    public void testIsAnagramWithNullString1() {
        String s1 = null;
        String s2 = "listen";
        assertThrows(NullPointerException.class, () -> Anagram.isAnagram(s1, s2));
    }
}