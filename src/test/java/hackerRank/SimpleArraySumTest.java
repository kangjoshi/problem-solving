package hackerRank;

import org.junit.Test;
import static org.junit.Assert.*;

public class SimpleArraySumTest {

    @Test
    public void givenIntegerArrayThenReturnSumValue() {

        int[] input = {1, 2, 3, 4, 10, 11};
        int sum = SimpleArraySum.sum(input);

        int expectSum = 31;

        assertNotNull(sum);
        assertEquals(sum, expectSum);
    }





}