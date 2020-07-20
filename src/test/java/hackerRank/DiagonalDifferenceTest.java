package hackerRank;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DiagonalDifferenceTest {

    List<List<Integer>> matrix;

    @Before
    public void init() {
        matrix = new ArrayList<>();

        matrix.add(Arrays.asList(1, 2, 3, 4));
        matrix.add(Arrays.asList(4, 5, 6, 7));
        matrix.add(Arrays.asList(7, 8, 9, 8));
        matrix.add(Arrays.asList(1, 2, 3, 4));
        //print();
    }

    @Test
    public void givenMatrixGetBothDiagonalValues() {
        int matrixSize = matrix.size() - 1;
        StringBuffer leftDiagonal = new StringBuffer();
        StringBuffer rightDiagonal = new StringBuffer();
        for (int i=0; i<matrix.size(); i++) {
            leftDiagonal.append(matrix.get(i).get(i));
            rightDiagonal.append(matrix.get(i).get(matrixSize - i));
        }

        assertEquals("1594", leftDiagonal.toString());
        assertEquals("4681", rightDiagonal.toString());
    }

    @Test
    public void givenMatrixGetBothDiagonalDifference() {

        int difference = DiagonalDifference.difference(matrix);

        assertEquals(0, difference);
    }


    private void print() {
        for (int i=0; i<matrix.size(); i++) {
            for (int j=0; j<matrix.get(i).size(); j++) System.out.print(matrix.get(i).get(j) + " ");
            System.out.println();
        }
    }

}