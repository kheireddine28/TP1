package BranchCoverage_exo2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnagramTest {
    @Test
    void isanagram_true() {
        assertEquals(true, BranchCoverage_exo2.Anagram.isAnagram("papa","apap"));
    }
    @Test
    void isanagrame_false_la_longueur_pas_egale(){
        assertEquals(false, BranchCoverage_exo2.Anagram.isAnagram("papaa","apap"));

    }
    @Test
    void isanagrame_la_longueur_egale_mais_deffirent(){
        assertEquals(false, BranchCoverage_exo2.Anagram.isAnagram("aaaa","apap"));

    }
    @Test
    public void testIsAnagramWithNullString1() {
        String s1 = null;
        String s2 = "listen";
        assertThrows(NullPointerException.class, () -> BranchCoverage_exo2.Anagram.isAnagram(s1, s2));
    }
    @Test
    public void testIsAnagramWithNullString2() {
        String s1 = null;
        String s2 = null;
        assertThrows(NullPointerException.class, () -> BranchCoverage_exo2.Anagram.isAnagram(s1, s2));
    }


}