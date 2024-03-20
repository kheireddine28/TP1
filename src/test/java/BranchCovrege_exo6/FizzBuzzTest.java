package BranchCovrege_exo6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    @Test
    void valleur_divisible_5_et_3()
    {
        assertEquals("FizzBuzz",FizzBuzz.fizzBuzz(15));
    }
    @Test
    void valleur_infreieur(){
        assertThrows(IllegalArgumentException.class,() ->FizzBuzz.fizzBuzz(0));
    }
    @Test
    void valleur_divisible_5(){
        assertEquals("Buzz",FizzBuzz.fizzBuzz(5));
    }
    @Test
    void valleur_divisible_3(){
        assertEquals("Fizz",FizzBuzz.fizzBuzz(3));
    }

}