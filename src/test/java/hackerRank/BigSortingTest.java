package hackerRank;

import org.junit.Test;

import static org.junit.Assert.*;

public class BigSortingTest {

    @Test
    public void givenStringArrayThenSortAsc() {
        String[] array = {"31415926535897932384626433832795", "1", "3", "10", "3", "5"};

        String[] sorted = BigSorting.sortAsc(array);

        assertEquals("1", sorted[0]);
        assertEquals("3", sorted[1]);
        assertEquals("3", sorted[2]);
        assertEquals("5", sorted[3]);
        assertEquals("10", sorted[4]);
        assertEquals("31415926535897932384626433832795", sorted[5]);
    }




}