package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제이해
 *  - int[] 배열와 int target 값이 주어질때 배열의 원소의 차이가 target과 같은 경우를 모두 구하고 갯수를 반환하라.
 *  - 1 2 3 4  1
 *    2 - 1 = 1
 *    3 - 2 = 1
 *    4 - 3 = 1
 *
 * 그려보기
 *  - Map에 담아서 순회하면서 k를 뺀 키와 같은 놈이 있는지 확인
 *
 */
public class Pairs {

    public static int search(int k, int[] arr) {
        int count = 0;

        Map<Integer, Boolean> numberMap = new HashMap<>(arr.length);

        for(int num : arr)
            numberMap.put(num, Boolean.valueOf(true));

        for (Map.Entry<Integer, Boolean> entry : numberMap.entrySet()) {
            if (numberMap.containsKey(entry.getKey() - k)) {
                //System.out.println(entry.getKey());
                count++;
            }
        }

        return count;
    }
}
