package hackerRank;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 문제이해
 *  - 사용자 A가 출제한 문제에 대한 점수 3개가 a[0], a[1], a[2]와 같이 b가 출제한 문제에 대한 점수가 b[0], b[1], b[2]와 같이 입력될때
 *    같은 인덱스에 위치한 점수를 비교하여 두 사용자의 승점을 구하라.
 *    점수가 다르면 큰 쪽이 승점 + 1, 같으면 승점 + 0
 *
 * 그려보기
 *  - 배열을 순차적으로 순회하며 a와 b의 요소를 비교
 *  - 점수를 비교하는 함수를 리턴
 *      - 점수를 받아 승자의 순서를 반환하는 함수
 *      - 승자가 없으면 -1 리턴
 *  - 최종 승점 배열 리턴
 *
 */
public class CompareTheTriplets {

    public static List<Integer> score(List<Integer> a, List<Integer> b) {
        int[] scores = new int[2];

        int index;
        for (int i=0; i<a.size(); i++) {
            index = getWinnerIndexByComparingPoint(a.get(i), b.get(i));
            if (index != -1) {
                scores[index] += 1;
            }
        }

        return Arrays.asList(scores[0], scores[1]);
    }

    private static int getWinnerIndexByComparingPoint(int aPoint, int bPoint) {
        if (aPoint == bPoint) return -1;
        return (aPoint > bPoint) ? 0 : 1;
    }
}
