package hackerRank;

/**
 * 문제이해
 *  - int[] array = [1, 1, 0, -1, -1]는 배열의 크기는 5이고 정수 2개, 0 1개, 음수 2개가 있다.
 *  - 이것들의 비율은 정수 2/5 = 0.400000, 0 1/5=0.200000, 음수 2/5=0.400000이다. 이와 같이 정수, 0, 음수의 비율을 출력하라.
 *
 * 그려보기
 *  - 정수, 음수, 0의 개수를 구한다.
 *  - 각각의 비율을 계산하여 배열에 담는다.
 */
public class PlusMinus {


    public static void ratios(int[] array) {
        int positive = 0;
        int zero = 0;
        int negative = 0;

        for (int num : array) {
            if (num > 0) {
                positive++;
            } else if (num < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.format("%f%n", (double) positive / array.length);
        System.out.format("%f%n", (double) negative / array.length);
        System.out.format("%f%n", (double) zero / array.length);
    }
}
