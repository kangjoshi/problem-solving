package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class CamelCaseTest {

    @Test
    public void giveSentenceThenReturnWordCount1() {
        String s = "oneTwoThree";
        int num = CamelCase.count(s);

        assertEquals(3, num);
    }

    @Test
    public void giveAWordThenReturnZero() {
        String s = "test";
        int num = CamelCase.count(s);

        assertEquals(1, num);
    }



}