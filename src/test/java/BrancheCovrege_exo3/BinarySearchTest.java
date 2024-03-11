package BrancheCovrege_exo3;

import LineCovrage_exo3.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void element_pas_dans_le_tableau(){
        int[]  array={1,2,3};
        assertEquals(-1,LineCovrage_exo3.BinarySearch.binarySearch(array,4));
    }
    @Test
    void element_dans_le_tableau(){
        int[]  array={1,2,3};
        assertEquals(0,LineCovrage_exo3.BinarySearch.binarySearch(array,1));
    }
    @Test
    void exception(){
        int[] array = null;
        assertThrows(NullPointerException.class, () -> BinarySearch.binarySearch(array, 5));

    }


}