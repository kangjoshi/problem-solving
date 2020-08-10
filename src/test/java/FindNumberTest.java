import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class FindNumberTest {

    @Test
    public void givenIntegerThenResultIsOneNumber() {
        int number = 999;
        boolean result = FindNumber.oneNumber(number);

        assertTrue(result);
    }

    @Test
    public void givenIntegerArrayThenResultsNumber() {
        int[] numbers = IntStream.rangeClosed(100, 999).filter(n -> (n / 10) % 10 == 0).toArray();

        int number = FindNumber.find(numbers);

        assertEquals(709, number);
    }


}