package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class SeparateTheNumbersTest {

    @Test
    public void givenSentenceThenReturnSplitNumbers() {
        String s = "010203";

        long[] result = SeparateTheNumbers.split(s);
        assertEquals(1, result[0]);
        assertEquals(10, result[1]);
        assertEquals(101, result[2]);
    }

    @Test
    public void givenSentenceThenReturnIsBeautiful() {
        String s = "10001001100210031004100510061007";

        SeparateTheNumbers.beautiful(s);

    }

    @Test
    public void splitTest() {
        String number = "010203";
        System.out.println(number.substring(0, 1));
        System.out.println(number.substring(1, 3));
        System.out.println(number.substring(3, 5));
    }


}