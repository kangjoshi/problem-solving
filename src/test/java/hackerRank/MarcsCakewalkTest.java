package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class MarcsCakewalkTest {

    @Test
    public void givenCakeArrayThenReturnTotalCalories() {
        int[] cakes = {5, 10 ,7};

        long calories = MarcsCakewalk.calories(cakes);

        assertEquals(53, calories);
    }

    @Test
    public void givenCakeArrayThenReturnMinDistance() {
        int[] cakes = {5, 10 ,7};

        long distance = MarcsCakewalk.minDistance(cakes);

        assertEquals(44, distance);
    }



}