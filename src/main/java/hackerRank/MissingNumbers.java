package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제이해
 *  - 주어진 배열 int[] a, int[] b를 비교하여 빠진 원소를 찾아 출력하라.
 *  arr = {7, 2, 5, 3, 5, 3}
 *  brr = {7, 2, 5, 4, 6, 3, 5, 3}
 *
 * 그려보기
 *  - 정렬하여 순차적으로 비교? 시간 문제가 있을꺼 같은데..
 *
 */
public class MissingNumbers {

    public static int[] missing(int[] arr, int[] brr) {
        Map<Integer, Integer> numberMap = new HashMap<>(arr.length);

        for (int num : arr)
            numberMap.put(num, numberMap.getOrDefault(num, 0) + 1);

        int[] results = new int[brr.length - arr.length];

        int index = 0;
        boolean isMissing;
        for (int i=0; i<brr.length; i++) {
            isMissing = false;
            if (!numberMap.containsKey(brr[i])) {
                isMissing = true;
            } else {
                int left = numberMap.get(brr[i]);
                if (left > 0) {
                    numberMap.put(brr[i], numberMap.get(brr[i]) - 1);
                } else {
                    isMissing = true;
                }
            }

            if (isMissing) {
                results[index++] = brr[i];
            }
        }

        Arrays.sort(results);

        for(int num : results) {
            System.out.print(num + " ");
        }

        return results;
    }
}
