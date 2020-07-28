package hackerRank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IceCreamParlorTest {


    @Test
    public void givenIntegerArrayThenGetResults() {
        int money = 8;
        int[] costs = {2, 1, 9, 4, 4, 56, 90, 3};


        int[] results = IceCreamParlor.iceCream(money, costs);

        assertEquals(4, results[0]);
        assertEquals(5, results[1]);

    }



}