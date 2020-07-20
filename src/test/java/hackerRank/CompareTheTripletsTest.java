package hackerRank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CompareTheTripletsTest {

    private List<Integer> a;
    private List<Integer> b;

    @Before
    public void init(){
        a = Arrays.asList(0, 1, 0);
        b = Arrays.asList(0, 0, 0);
    }

    @Test
    public void givenTwoPointsArrayThenReturnScoreArray() {

        List<Integer> scores = CompareTheTriplets.score(a, b);

        assertNotNull(scores);
        assertEquals(2, scores.size());
        assertEquals(1, (int) scores.get(0));
        assertEquals(0, (int) scores.get(1));
    }



}