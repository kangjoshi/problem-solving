package hackerRank;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * 문제이해
 *  - 주어진 문자 배열 String[] = {31415926535897932384626433832795, 1, 3, 10, 3, 5}와 같이 주어질때 순서대로 정렬하는 함수를 작성하라.
 *
 * 그려보기
 *  - 큰 수를 고려하여 정렬해야 할듯.
 *    - 일반적인 방법의 정렬에서는 시간 통과 못함
 *      - String에서 형변환 하는 시간을 줄여야 될듯?
 *      - 형변환이 필요없이 String 길이로 비교하고 길이가 같다면 앞에서부터 한자리씩 비교 String.compareTo가 이미 그렇게 구현되어 있음.
 */
public class BigSorting {

    public static String[] sortAsc(String[] array) {
        Arrays.sort(array, (e1, e2) -> {
            if (e1.length() == e2.length()) {
                return e1.compareTo(e2);
            }
            return (e1.length() > e2.length()) ? 1 : -1;
        });
        return array;
    }


}

