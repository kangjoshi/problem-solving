package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class AVeryBigSumTest {

    @Test
    public void givenEmptyArrayThenReturnZero() {
        long[] array = {};

        long sum = AVeryBigSum.sum(array);

        assertNotNull(sum);
        assertEquals(0, sum);
    }

    @Test
    public void givenLongArrayThenReturnSumValue() {

        long[] array = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};

        long sum = AVeryBigSum.sum(array);

        assertNotNull(sum);
        assertTrue(sum > 0);

    }

}