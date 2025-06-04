import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class PrimeFactorTest {
    private PrimeFactor primeFactor;

    @BeforeEach
    void setUp() {
        primeFactor = new PrimeFactor();
    }

    @Test
    void testPrimefactorOf1() {
        assertEquals(Arrays.asList(), primeFactor.of(1));
    }

    @Test
    void testPrimefactorOf2() {
        assertEquals(Arrays.asList(2), primeFactor.of(2));
    }

    @Test
    void testPrimefactorOf3() {
        assertEquals(Arrays.asList(3), primeFactor.of(3));
    }

    @Test
    void testPrimefactorOf4() {
        assertEquals(Arrays.asList(2,2), primeFactor.of(4));
    }

    @Test
    void testPrimefactorOf6() {
        assertEquals(Arrays.asList(2,3), primeFactor.of(6));
    }

    @Test
    void testPrimefactorOf9() {
        assertEquals(Arrays.asList(3,3), primeFactor.of(9));
    }

    @Test
    void testPrimefactorOf12() {
        assertEquals(Arrays.asList(2,2,3), primeFactor.of(12));
    }
}