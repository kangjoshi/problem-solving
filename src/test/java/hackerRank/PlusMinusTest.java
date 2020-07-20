package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class PlusMinusTest {

    private int[] array = {1, 1, 0, -1, -1};

    @Test
    public void givenIntegerArrayPrintRatiosPositiveAndZeroAndNegative() {
        PlusMinus.ratios(array);
    }

}