package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class PairsTest {

    @Test
    public void givenTargetAndIntegerArrayThenReturnSearchCount() {

        int k = 1;
        int[] arr = {1, 2, 3, 4};

        int result = Pairs.search(k, arr);

        assertEquals(3, result);
    }

    @Test
    public void givenTargetAndIntegerArrayThenReturnSearchCount2() {

        int k = 2;
        int[] arr = {1, 5, 3, 4, 2};

        int result = Pairs.search(k, arr);

        assertEquals(3, result);
    }



}