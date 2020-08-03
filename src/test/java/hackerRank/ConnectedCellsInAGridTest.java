package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConnectedCellsInAGridTest {

    @Test
    public void givenMatrixThenSearchLargestRegion() {
        int[][] matrix = {{1, 1, 0}, {1, 0, 0}, {0, 0, 1}};
        int result = ConnectedCellsInAGrid.largestRegion(matrix);
        assertEquals(3, result);
    }

    @Test
    public void givenMatrixThenSearchLargestRegion2() {
        int[][] matrix = {{1, 1, 0, 0}, {0, 1, 1, 0}, {0, 0, 1, 0}, {1, 0, 0, 0}};
        int result = ConnectedCellsInAGrid.largestRegion(matrix);
        assertEquals(5, result);
    }

    @Test
    public void givenMatrixThenSearchLargestRegion3() {
        int[][] matrix = {{0, 1, 1, 1, 1}, {1, 0, 0, 0, 1}, {1, 1, 0, 1, 0}, {0, 1, 0, 1, 1}, {0, 1, 1, 1, 0}};
        int result = ConnectedCellsInAGrid.largestRegion(matrix);
        assertEquals(15, result);
    }





}