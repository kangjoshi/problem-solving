package hackerRank;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class MigratoryBirdsTest {

    @Test
    public void givenBirdsThenReturnMostCommonBird() {
        List<Integer> birds = Arrays.asList(1, 2, 2, 3, 3, 3, 5, 5, 5);

        int bird = MigratoryBirds.common(birds);

        assertEquals(3, bird);
    }


}