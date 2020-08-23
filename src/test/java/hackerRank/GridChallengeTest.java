package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class GridChallengeTest {

    @Test
    public void givenCharacterGridThenReturnIsOrdered() {

        String[] grid = {"ebacd", "fghij", "olmkn", "trpqs", "xywuv"};

        String result = GridChallenge.isOrdered(grid);

        assertNotNull(result);
        assertEquals("YES", result);
    }

}