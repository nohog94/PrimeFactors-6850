import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PrimeFactorTest {

    @Test
    PrimeFactorTest(){
        PrimeFactor primeFactor = new PrimeFactor();
        int ret = primeFactor.getPrimeFactors(20);
        assertEquals(20, 20);
    } {
    }
}