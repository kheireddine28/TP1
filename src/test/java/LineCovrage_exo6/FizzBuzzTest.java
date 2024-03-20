package LineCovrage_exo6;

import BranchCovrege_exo6.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void valleur_divisible_5_et_3()
    {
        assertEquals("FizzBuzz", LineCovrage_exo6.FizzBuzz.fizzBuzz(15));
    }
    @Test
    void valleur_infreieur(){
        assertThrows(IllegalArgumentException.class,() -> LineCovrage_exo6.FizzBuzz.fizzBuzz(0));
    }
    @Test
    void valleur_divisible_5(){
        assertEquals("Buzz", LineCovrage_exo6.FizzBuzz.fizzBuzz(5));
    }
    @Test
    void valleur_divisible_3(){
        assertEquals("Fizz", LineCovrage_exo6.FizzBuzz.fizzBuzz(3));
    }


}