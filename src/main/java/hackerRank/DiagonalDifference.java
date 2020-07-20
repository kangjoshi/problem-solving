package hackerRank;

import java.util.List;

/**
 * 문제이해
 *  - 아래와 같은 이차원 배열이 주어질때 대각선의 차이를 구하라
 *      1 2 3
 *      4 5 6
 *      9 8 9
 *
 * 그려보기
 *  - 왼 -> 오른쪽 아래 방향으로 진행하는 대각선의 합을 구한다.
 *    ? 만약 사각형이 더 늘어난다면 (사각형의 크기와 상관없이 홀수, 짝수 사이즈일때를 생각해서 대각선을 구해보자)
 *
 *    1 2 3
 *    4 5 6
 *    7 8 9
 *    왼 대각선 : 0-0, 1-1, 2-2     i = j
 *    오른 대각선 : 0-2, 1-1, 2-0    i = 순차 증가, j = j.length - i
 *
 *    1 2 3 4
 *    4 5 6 7
 *    7 8 9 8
 *    2 3 4 5
 *    왼 대각선 : 0-0, 1-1, 2-2, 3-3    i = j
 *    오른 대각선 : 0-3, 1-2, 2-1, 3-0   i = 순차 증가, j = j.length - i
 *
 *  - 오른 -> 왼 윗 방향으로 진행하는 대각선의 합을 구한다.
 *  - 두 값이 차이를 반환
 *
 */
public class DiagonalDifference {

    public static int difference(List<List<Integer>> matrix) {
        int matrixSize = matrix.size() - 1;

        int leftSum = 0;
        int rightSum = 0;

        for (int i=0; i<matrix.size(); i++) {
            leftSum += matrix.get(i).get(i);
            rightSum += matrix.get(i).get(matrixSize - i);
        }

        return Math.abs(leftSum - rightSum);
    }
}
