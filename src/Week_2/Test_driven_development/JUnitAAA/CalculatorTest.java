import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
        System.out.println("Setup completed");
    }

    @Test
    public void testAddition() {

        int result = calculator.add(10, 20);

        assertEquals(30, result);
    }

    @After
    public void tearDown() {
        calculator = null;
        System.out.println("Teardown completed");
    }
}