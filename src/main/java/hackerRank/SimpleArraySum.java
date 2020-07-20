package hackerRank;

/**
 * 문제이해
 *  - int[] array = [1, 2, 3]와 같이 주어질때 합을 리턴하는 함수를 만들라.
 *
 * 그려보기
 *  - 배열을 순차적으로 순회하며 sum을 해간다.
 *  - sum을 리턴한다.
 *
 */
public class SimpleArraySum {

    public static int sum(int[] input) {
        int sum = 0;
        for(int i : input) sum += i;
        return sum;
    }
}
