package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoStringsTest {

    @Test
    public void givenTwoSentenceThenReturnIsShare() {
        String s1 = "asifg";
        String s2 = "world";

        String result = TwoStrings.share(s1, s2);

        assertEquals("No", result);

    }

}