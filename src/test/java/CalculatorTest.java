import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    /**
     * Method under test: {@link Calculator#sum(int, int)}
     */
    @Test
    public void testSum() {
        assertEquals(5, (new Calculator()).sum(2, 3));
        assertEquals(2, (new Calculator()).sum(1, 1));
        assertEquals(6, (new Calculator()).sum(3, 3));
        assertEquals(4, (new Calculator()).sum(1, 3));
    }

    /**
     * Method under test: {@link Calculator#sub(int, int)}
     */
    @Test
    public void testSub() {
        assertEquals(-1, (new Calculator()).sub(2, 3));
        assertEquals(0, (new Calculator()).sub(1, 1));
        assertEquals(0, (new Calculator()).sub(3, 3));
        assertEquals(-2, (new Calculator()).sub(1, 3));
    }

    /**
     * Method under test: {@link Calculator#div(int, int)}
     */
    @Test
    public void testDiv() throws InvalidOperation {
        assertEquals(0, (new Calculator()).div(2, 3));
        assertEquals(1, (new Calculator()).div(3, 3));
        assertEquals(0, (new Calculator()).div(1, 3));
    }

    /**
     * Method under test: {@link Calculator#mult(int, int)}
     */
    @Test
    public void testMult() {
        assertEquals(6, (new Calculator()).mult(2, 3));
        assertEquals(1, (new Calculator()).mult(1, 1));
        assertEquals(9, (new Calculator()).mult(3, 3));
        assertEquals(3, (new Calculator()).mult(1, 3));
    }
}

