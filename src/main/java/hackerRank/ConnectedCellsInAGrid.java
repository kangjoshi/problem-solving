package hackerRank;

/**
 * 문제이해
 *  - int[][] matrix의 각 셀은 0, 1 둘 중 하나의 값을 가지고 있다. 그리고 값이 1인 셀은 채워진 셀이다.
 *  - 인접한 채워진 셀은 연결될 수 있고 이를 구역이라 한다. 하나의 채워진 셀도 구역이다.
 *  - 가장 큰 구역의 채워진 셀의 수를 리턴하라.
 *
 *  조건
 *  0 < x, y < 10
 *
 *  1 1 0
 *  1 0 0
 *  0 0 1
 *  (0, 0), (0, 1), (1, 0)
 *  (2, 2)
 *
 *  0 1 1
 *  0 0 0
 *  1 0 0
 *  (0, 1), (0, 2)
 *  (2, 0)
 *
 *  0 1 1 1 1
 *  1 0 0 0 1
 *  1 1 0 1 0
 *  0 1 0 1 1
 *  0 1 1 1 0
 *
 *
 * 그려보기
 *  - 채워진 셀로 부터 (x+1, y), (x, y+1) 이 채워진 셀이라면 연결될 수 있음.
 *      - 대각선에 있는 집도 허용인듯?
 *  - 구역을 탐색하는 함수 작성
 *      - 깊이 우선 탐색 이용해서 하면 될듯?
 *
 *
 */
public class ConnectedCellsInAGrid {

    private static final int FILLED = 1;
    private static final int[][] DIRECTIONS = {{1, 0}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public static int largestRegion(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];

        int largestRegionCount = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == FILLED && !visited[i][j]) {
                    int count = 0;
                    largestRegionCount = Math.max(largestRegionCount, dfs(i, j, matrix, visited, count));
                }
            }
        }

        return largestRegionCount;
    }

    private static int dfs(int x, int y, int[][] matrix, boolean[][] visited, int count) {
        visited[x][y] = true;
        count++;

        for (int i = 0; i < DIRECTIONS.length; i++) {
            int dx = x + DIRECTIONS[i][0];
            int dy = y + DIRECTIONS[i][1];
            if (isVaildDir(dx, dy, matrix) && matrix[dx][dy] == 1 && !visited[dx][dy]) {
                count = dfs(dx, dy, matrix, visited, count);
            }
        }
        return count;
    }
    private static boolean isVaildDir ( int dx, int dy, int[][] matrix){
        int sizeX = matrix.length;
        int sizeY = matrix[0].length;
        return dx >= 0 && dx < sizeX && dy >= 0 && dy < sizeY;
    }
}


