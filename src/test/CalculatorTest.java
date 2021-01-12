package test;

import dev.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void returnZeroIfEmpty(){
        assertEquals(0, Calculator.add(""));
    }

    @Test
    public void returnNumberIfNumber(){
        assertEquals(5, Calculator.add("5"));
    }

    @Test
    public void returnSumOfNumbersIfSeparatedByCommas(){
        assertEquals(8, Calculator.add("1,7"));
    }
}
