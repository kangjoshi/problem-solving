package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class FunnyStringTest {

    @Test
    public void givenSentenceThenReturnIsFunny() {
        String s = "acxz";
        String result = FunnyString.funny(s);
        assertEquals("Funny", result);
    }

    @Test
    public void givenSentenceThenReturnIsFunny2() {
        String s = "bcxz";
        String result = FunnyString.funny(s);
        assertEquals("Not Funny", result);
    }

    @Test
    public void givenSentenceThenReturnAsciiCodes() {
        String s = "acxz";

        int[] result = FunnyString.ascii(s);

        assertEquals(97, result[0]);
        assertEquals(99, result[1]);
        assertEquals(120, result[2]);
        assertEquals(122, result[3]);
    }

    @Test
    public void givenAsciiCodesThenReturnGaps() {
        int[] asciiCodes = {97, 99, 120, 122};

        int[] gaps = FunnyString.gap(asciiCodes);

        assertEquals(2, gaps[0]);
        assertEquals(21, gaps[1]);
        assertEquals(2, gaps[2]);
    }

    @Test
    public void givenOddArrayThenCheckIsSymmetry() {
        int[] array1 = {2, 21, 2};
        boolean result1 = FunnyString.symmetry(array1);
        assertTrue(result1);

        int[] array2 = {2, 21, 3, 21, 3};
        boolean result2 = FunnyString.symmetry(array2);
        assertFalse(result2);
    }

    @Test
    public void givenEvenArrayThenCheckIsSymmetry() {
        int[] array1 = {2, 21, 21, 2};
        boolean result1 = FunnyString.symmetry(array1);
        assertTrue(result1);

        int[] array2 = {2, 21, 22, 22, 21, 3};
        boolean result2 = FunnyString.symmetry(array2);
        assertFalse(result2);
    }
}