package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountLuckTest {

    private static final String RON_RIGHT = "Impressed";
    private static final String RON_WRONG = "Oops!";

    @Test
    public void givenForestThenPrintForest() {
        String[] matrix = {"*.M", ".X."};
        CountLuck.print(matrix);
    }

    @Test
    public void givenForestThenReturnsStartPosition() {
        String[] matrix = {"*.M", ".X."};
        int[] position = CountLuck.startPosition(matrix);

        assertEquals(2, position.length);
        assertEquals(0, position[0]);
        assertEquals(2, position[1]);
    }

    @Test
    public void givenForestThenReturnsPortkeyPosition() {
        String[] matrix = {"*.M", ".X."};

        int[] position = CountLuck.portkey(matrix);

        assertEquals(2, position.length);
        assertEquals(0, position[0]);
        assertEquals(0, position[1]);
    }

    @Test
    public void givenForestThenReturnsPortkeyPosition2() {
        String[] matrix = {".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX."};

        int[] position = CountLuck.portkey(matrix);

        assertEquals(2, position.length);
        assertEquals(1, position[0]);
        assertEquals(2, position[1]);
    }

    @Test
    public void givenForestAndRonsExpectThenReturnsRonIsImpressedOrNot() {
        int k = 1;
        String[] matrix = {"*.M", ".X."};
        String result = CountLuck.countLuck(matrix, k);
        assertEquals(RON_RIGHT, result);
    }

    @Test
    public void givenForestAndRonsExpectThenReturnsRonIsImpressedOrNot2() {
        int k = 3;
        String[] matrix = {".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX."};
        String result = CountLuck.countLuck(matrix, k);
        assertEquals(RON_RIGHT, result);
    }

    @Test
    public void givenForestAndRonsExpectThenReturnsRonIsImpressedOrNot3() {
        int k = 4;
        String[] matrix = {".X.X......X", ".X*.X.XXX.X", ".XX.X.XM...", "......XXXX."};
        String result = CountLuck.countLuck(matrix, k);
        assertEquals(RON_WRONG, result);
    }





}