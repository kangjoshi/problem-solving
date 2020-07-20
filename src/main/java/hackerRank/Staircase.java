package hackerRank;

/**
 * 문제이해
 *  - 정수 n이 주어질때 # 모양의 계층을 만들어 출력하라, 마지막은 빈 공간이 없어야 한다.
 *    n = 3
 *      #   2
 *     ##  12
 *    ### 012
 *
 * 그려보기
 *  - 주어진 정수만큼 순회하며 #를 그려나간다.
 */
public class Staircase {

    private static final char SYMBOL = '#';
    private static final char SPACE = ' ';

    public static void print(int n) {
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) System.out.print((j < n-1-i) ? SPACE : SYMBOL);
            System.out.println();
        }
    }
}
