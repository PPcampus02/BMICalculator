package org.campus02.pollheimer;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BMICalculatorTest {

    @BeforeEach
    void setup() {

    }
    @Test
    public void testConstructor () {

        BMICalculator calculator = new BMICalculator("Philip", "Pollheimer", 176, 72.0, 'm');
        assertEquals("Philip", calculator.getFirstname());
        assertEquals("Pollheimer", calculator.getLastname());
        assertEquals(176, calculator.getBodyHeight());
        assertEquals(72.0, calculator.getBodyWeight());
        assertEquals('m', calculator.getGender());
    }
    @Test
    void testCalculateBMI () {
        BMICalculator calculator = new BMICalculator("Maxi", "Mueller", 185, 65.0, 'm');
        assertEquals(18.99, calculator.calculateBMI(), 0.01);

        BMICalculator calculator2 = new BMICalculator("Marie", "Schneider", 167, 60.0, 'w');
        assertEquals(21.51, calculator2.calculateBMI(), 0.01);
    }
}
