package hackerRank;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 문제이해
 *  - int[] birds = {1, 1, 2, 2, 3}와 같이 새의 종류를 나타내는 배열이 주어질때
 *    가장 많이 등장하는 새의 종류를 반환하라.
 *    N개가 나온다면 가장 작은 새의 종류 반환
 *    새의 종류는 1, 2, 3, 4, 5로 고정 되어있다.
 *
 * 그려보기
 *  - Map을 이용하여 각 새의 종류마다 숫자를 기록한다.
 *  - Map에 담긴 가장 작은수의 새의 숫자를 리턴한다.
 *  - 새의 종류가 5가지고 적은편이므로 정렬해서 비교하는 것보다 Map을 이용하는게 유리할꺼 같다.
 */
public class MigratoryBirds {

    public static int common(List<Integer> birds) {
        Map<Integer, Integer> birdMap = new HashMap<>();
        for (int bird : birds) {
            birdMap.put(bird, birdMap.getOrDefault(bird, 0) + 1);
        }

        int bird = 0;
        int lastBirdCount = 0;
        for (Map.Entry<Integer, Integer> entry : birdMap.entrySet()) {
            if (lastBirdCount < entry.getValue()) {
                bird = entry.getKey();
                lastBirdCount = entry.getValue();
            }
        }
        return bird;
    }
}
