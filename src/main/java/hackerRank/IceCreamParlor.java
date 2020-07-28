package hackerRank;

import java.util.Arrays;

/**
 * 문제이해
 *  - 조니와 서니는 가지고 있는 돈으로 아이스크림을 구매할 때 아래 조건을 만족하면서 구매한 아이스크림의 인덱스를 반환하라.
 *  조건
 *   - 가지고 있는 돈을 모두 사용
 *   - 서로의 아이스크림은 겹치지 않는다.
 *
 *   m = 6
 *   cost = [1, 3, 4, 5, 6]
 *
 *   1, 5 => 1, 4 (인덱스 + 1)
 *
 * 그려보기
 *  - 조니의 아이스크림은 결정하고
 *  - 서니가 구매할 수 있는 아이스크림이 있는지 확인한다.
 *
 */
public class IceCreamParlor {


    public static int[] iceCream(int money, int[] costs) {

        int left;
        for (int i=0; i<costs.length; i++) {

            left = money - costs[i];
            for (int j=i+1; j<costs.length; j++) {
                if (costs[j] == left) {
                    int[] results = new int[2];
                    results[0] = Math.min(i+1, j+1);
                    results[1] = Math.max(i+1, j+1);
                    return results;
                }
            }
        }
        return new int[2];
    }
}
