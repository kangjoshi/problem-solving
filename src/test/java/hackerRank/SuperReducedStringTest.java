package hackerRank;

import org.junit.Test;


import static org.junit.Assert.*;

public class SuperReducedStringTest {

    @Test
    public void givenStringThenReturnReducoedString() {
        String s = "aaabccddd";

        String result = SuperReducedString.reduce(s);

        assertNotEquals("", result);
        assertEquals("abd", result);
    }

}