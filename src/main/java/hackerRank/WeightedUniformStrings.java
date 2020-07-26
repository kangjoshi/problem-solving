package hackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제이해
 *  - 각 알파벳의 무게가 a ~ z -> 1 ~ 26이다.
 *  - 같은 문자열이 연달아 나오면 합산 가능
 *    a = 1
 *    aa = 2 (1+1)
 *    aaa = 3 (1+1+1)
 *  - 문자열은 소문자만 들어옴.
 *
 *  - 주어진 쿼리(int[])가 하면 Yes 아니면 No를 가지는 배열을 반환하라
 *
 * 그려보기
 *  - 문자열의 weight를 저장하는 맵 생성
 *  - 쿼리를 순회하며 찾는 무게가 Map에 있는지 확인하여 결과 반환
 */
public class WeightedUniformStrings {

    public static String[] matches(String s, int[] queries) {
        String[] result = new String[queries.length];
        Map<Integer, Boolean> weightMap = new HashMap<>();

        char last = ' ';
        int sameWeightSum = 0;
        for (char c : s.toCharArray()) {
            int weight = ((int) c) - 96;
            if (last == c) {
                sameWeightSum += weight;
                weightMap.put(sameWeightSum, true);
            } else {
                sameWeightSum = weight;
                weightMap.put(weight, true);
            }
            last = c;
        }

        for(int i=0; i<queries.length; i++) {
            result[i] = weightMap.containsKey(queries[i]) ? "Yes" : "No";
        }

        return result;
    }
}
