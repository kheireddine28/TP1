package LineCoverage_exo4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuadraticEquationTest {
    @Test
    void exception(){
        int a=0;
        int b=2;
        int c=3;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a,b,c));

    }
    @Test
    void soulution_double(){
        int a=1;
        int b=2;
        int c=1;
        assertEquals(-1,QuadraticEquation.solve(a,b,c));

    }
    @Test
    void pas_souliton(){
        int a=0;
        int b=2;
        int c=3;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a,b,c));

    }
    @Test
    void deux_soulution(){
        int a=0;
        int b=2;
        int c=3;
        assertThrows(IllegalArgumentException.class, () -> QuadraticEquation.solve(a,b,c));

    }


}