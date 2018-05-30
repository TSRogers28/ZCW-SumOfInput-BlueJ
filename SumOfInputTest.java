

import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class SumOfInputTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class SumOfInputTest
{ SumOfInput testSum = new SumOfInput();
    @Test
    public void testSumOfInput()
    {
    
    {
        // : Given
        int passingTestValue = 10;
        int expected = 55;

        // : When
        int actual = testSum.getSum(10);

        // : Then
        Assert.assertEquals(expected, actual);
    }
    }
}