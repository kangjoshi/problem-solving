package hackerRank;

import java.util.HashMap;
import java.util.Map;

/**
 * 문제이해
 *  - 문자열 2개가 주어질때 두 문자열중 겹치는 문자가 있는지 확인하고 있다면 Yes 없다면 No를 반환
 *
 * 그려보기
 *  - 둘중 큰 놈을 Map에 저장하고
 *  - 긴놈을 순회하며 문자열 포함 여부 확인한다.
 *
 */
public class TwoStrings {


    public static String share(String s1, String s2) {
        Map<Character, Boolean> charMap = new HashMap<>();

        String baseStr = (s1.length() > s2.length()) ? s1 : s2;
        String subStr = (s1.length() > s2.length()) ? s2 : s1;

        for (char c : baseStr.toCharArray()) {
            charMap.put(c, true);
        }

        for (char c : subStr.toCharArray()) {
            if (charMap.containsKey(c))
                return "YES";
        }
        return "NO";
    }
}
