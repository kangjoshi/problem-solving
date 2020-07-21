package hackerRank;

import org.junit.Test;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class GradingStudentsTest {

    @Test
    public void givenGradesThenReturnRealGrades() {
        List<Integer> input = Arrays.asList(73, 70, 38, 33);

        List<Integer> grades = GradingStudents.adjust(input);

        Integer[] expected = {75, 70, 40, 33};

        assertNotNull(grades);
        assertEquals(grades.size(), input.size());
        assertArrayEquals(expected, grades.toArray());
    }
}