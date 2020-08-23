package hackerRank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 문제이해
 *  - a-z까지의 알파벳으로 이루어진 그리드가 주어질때
 *      a b c
 *      a d e
 *      e f g
 *  - 행을 정렬하고
 *  - 열이 오름차순이라면 YES, 아니면 NO을 반환하시오.
 *
 * 그려보기
 *  - 각 열의 글자를 비교하여 알파벳이 오름차순인지 확인한다.
 *  - 비교중 오름차순이 아닌것이 있다면 NO를 즉시 리턴한다.
 *      a b c
 *      a d e
 *      e f g
 */
public class GridChallenge {

    private static final String YES = "YES";
    private static final String NO = "NO";

    public static String isOrdered(String[] grid) {
        if (grid == null || grid[0].length() == 0) {
            return NO;
        }

        boolean isOk = true;
        Map<Integer, Character> charMap = new HashMap<>();
        for (int i=0; i< grid.length; i++) {
            isOk = putAndCompare(charMap, grid[i]);
            if (!isOk) break;
        }

        return isOk ? YES : NO;
    }

    private static boolean putAndCompare(Map<Integer, Character> charMap, String str) {
        str = sortStr(str);
        for (int i=0; i<str.length(); i++) {
            char c = str.charAt(i);
            if (charMap.containsKey(i)) {
                if (charMap.get(i) > c) {
                    return false;
                }
                charMap.put(i, c);
            } else {
                charMap.put(i, c);
            }
        }
        return true;
    }

    private static String sortStr(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    private static void print(String[] grid) {
        for (String g : grid) {
            System.out.println(g);
        }
    }

}
