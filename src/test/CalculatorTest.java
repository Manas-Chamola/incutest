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

    @Test
    public void returnSumOfMultipleNumbersIfSeparatedByCommas(){
        assertEquals(29, Calculator.add("1,7,10,11"));
    }

    @Test
    public void acceptNewLineAsDelimiter(){
        assertEquals(6, Calculator.add("1\n2,3"));
    }

    @Test
    public void acceptCustomDelimiterSyntax(){
        assertEquals(3, Calculator.add("//;\\n1;2"));
    }

}
