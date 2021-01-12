package test;

import dev.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void returnZeroIfEmpty(){
        assertEquals(0, Calculator.add(""));
    }
}
