package hackerRank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class WeightedUniformStringsTest {

    @Test
    public void givenSentenceAndQueriesThenReturnMatchResult(){
        String s = "abccc";
        int[] queries = {1, 3, 2, 5, 9, 10};

        String[] results = WeightedUniformStrings.matches(s, queries);

        assertEquals(results.length, queries.length);
        assertEquals("Yes", results[0]);
        assertEquals("Yes", results[1]);
        assertEquals("Yes", results[2]);
        assertEquals("No", results[3]);
        assertEquals("Yes", results[4]);
        assertEquals("No", results[5]);

    }


}