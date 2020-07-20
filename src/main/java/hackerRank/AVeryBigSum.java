package hackerRank;

/**
 * 문제이해
 *  - long[] array = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005}와 같이 주어질때 합을 리턴하는 함수를 만들라.
 *
 * 그려보기
 *  - 배열을 순차적으로 순회하며 sum을 해간다.
 *  - sum을 리턴한다. 큰 수이므로 long 타입 이용
 *
 */
public class AVeryBigSum {

    public static long sum(long[] array) {

        long sum = 0;
        for (long num : array) {
            sum += num;
        }

        return sum;
    }
}
