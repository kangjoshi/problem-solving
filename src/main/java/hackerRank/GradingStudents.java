package hackerRank;

import javax.sound.midi.Soundbank;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

/**
 * 문제이해
 *  - 0 ~ 100 범위의 grade 배열을 받을때 아래 조건에 따라 재 조정된 grade 배열을 반환하라.
 *    조건
 *      1. 점수에서 5단위로 반올림할 때 반올림값 - 원본값 <= 3이면 반올림 값 아니면 원본 값
 *      2. 38점 이하면 그대로 출력
 *
 *    73 - 75 = 2 => 75
 *    67 - 70 = 3 => 67
 *    38 - 40 = 2 => 40
 *    33 - X
 *
 *
 * 그려보기
 *  - 배열을 순회하며 점수를 가져온다
 *  - 반올림할 수 있는 값을 구하고 원본 값과 빼서 값을 결정하고 배열에 담는다.
 */
public class GradingStudents {

    private static final int ALLOWED_GAP = 2;

    public static List<Integer> adjust(List<Integer> input) {
        List<Integer> grades = new ArrayList<>(input.size());
        for (int i : input) {
            if (i >= 38) {
                int piece = i % 10;
                int gap = ((piece <= 5) ? 5 : 10) - piece;
                int plus = (gap <= ALLOWED_GAP) ? gap : 0;
                i += plus;
            }
            grades.add(i);
        }
        return grades;
    }
}
