package BrancheCovrege_exo3;

import LineCovrage_exo3.BinarySearch;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {
    @Test
    void element_pas_dans_le_tableau(){
        int[]  array={1,2,3};
        assertEquals(-1,BrancheCovrege_exo3.BinarySearch.binarySearch(array,4));
    }
    @Test
    void element_dans_le_tableau_a_mileu(){
        int[]  array={1,2,3};
        assertEquals(1,BrancheCovrege_exo3.BinarySearch.binarySearch(array,2));
    }
    @Test
    void element_dans_le_tableau_a_gauche(){
        int[]  array={1,2,3};
        assertEquals(0,BrancheCovrege_exo3.BinarySearch.binarySearch(array,1));
    }
    @Test
    void element_dans_le_tableau_a_droite(){
        int[]  array={1,2,3};
        assertEquals(2,BrancheCovrege_exo3.BinarySearch.binarySearch(array,3));
    }
    @Test
    void exception(){
        int[] array = null;
        assertThrows(NullPointerException.class, () -> BrancheCovrege_exo3.BinarySearch.binarySearch(array, 5));

    }


}