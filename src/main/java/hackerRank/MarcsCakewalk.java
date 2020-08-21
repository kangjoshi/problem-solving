package hackerRank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.IntStream;

/**
 * 문제이해
 *  - 마크가 먹은 케이크의 칼로리는 j는 배열의 인덱스, c는 배열의 값 일때 Math.pow(2, j) X c로 계산이되고 그 합은 그가 칼로리를 계산하기 위해 걸어야하는 거리입니다.
 *
 * 그려보기
 *  - 케이크 칼로리 합을 구하는 식을 구한다.
 *  - 주어진 케이크 배열을 역순으로 뒤집는다.
 *  - 값을 반환한다.
 */
public class MarcsCakewalk {
    public static long minDistance(int[] cakes) {
        Arrays.sort(cakes);
        int[] reverse = new int[cakes.length];
        int index = 0;
        for (int i= cakes.length-1; i>=0; i--) {
            reverse[index++] = cakes[i];
        }

        return calories(reverse);
    }

    public static long calories(int[] cakes) {

        long calories = 0;
        for (int i=0; i<cakes.length; i++) {
            calories += get(i, cakes[i]);
        }

        return calories;
    }

    private static double get(int index, int cake) {
        return Math.pow(2, index) * cake;
    }
}
