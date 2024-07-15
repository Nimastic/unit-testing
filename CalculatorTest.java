import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.sum(1, 2));
    }
}

