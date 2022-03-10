import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;


public class FibonacciTest {

    @Test
    public void negativeNumber() {
        assertThrows(RuntimeException.class, () -> Fibonacci.compute(-1));
    }

    @Test
    public void validResultNumber0() {
        assertEquals(0, Fibonacci.compute(0));
    }

    @Test
    public void validResultNumber1() {
        assertEquals(1, Fibonacci.compute(1));
    }

    @Test
    public void validResultNumber2() {
        assertEquals(1, Fibonacci.compute(2));
    }

    @Test
    public void validResultNumber5() {
        assertEquals(5, Fibonacci.compute(5));
    }

}
