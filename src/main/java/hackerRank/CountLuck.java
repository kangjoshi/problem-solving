package hackerRank;

import java.util.Map;

/**
 * 문제이해
 *  - 론과 헤르미온느는 포션을 모으기위해 금지된 숲에 들어가 길을 잃었다.
 *  - 숲은 N x M 크기를 가지고 있고 시작점은 M, 포키는 *, 빈공간은 . 그리고 나무는 X로 표현된다.
 *  - 론과 헤르미온느는 시작점에서 출발하여 빈 공간으로 이동(상하좌우) 가능하지만 트리는 관통하여 통과하지 못한다.
 *  - 포키를 만나면 론과 헤르미온느는 숲을 탈출할 수 있다.
 *  - 헤르미온느는 포키를 찾아 떠나기로 선택하였고 이동하면서 갈림길에서 방향을 선택할 때 마다 지팡이를 흔들어야 하고 론은 그녀가 지팡이를 흔들 횟수를 예상하고 있다.
 *  - 론의 예상이 정확하면 Impressed 아니면 Oops!를 반환하는 함수를 작성하라.
 *
 *    .X.X.10000X
 *    .X*0X0XXX0X
 *    .XX0X0XM01.
 *    ...100XXXX.
 *
 *    0은 방향 선택 없이 이동, 1은 방향을 선택
 *
 * 그려보기
 *  - 상하좌우가 이동가능 하므로 이동할 수 있는 모든 경로를 움직이며 빈 공간이 하나 이상이면 갈림길인것
 *  - 갈림길이 선택될 때 마다 count하고 마지막에 론의 추측과 비교하여 정답 리턴
 *
 */
public class CountLuck {

    private static final int[][] DIRECTIONS = {{-1, 0}, {0, 1}, {0, -1}, {1, 0}};
    private static final char DEFAULT_START_MARK = 'M';
    private static final char DEFAULT_ROAD_MARK = '.';
    private static final char DEFAULT_PORTKEY_MARK = '*';
    private static final String RON_RIGHT = "Impressed";
    private static final String RON_WRONG = "Oops!";

    private static boolean[][] visited;
    private static int[] portkey = new int[2];
    private static int totWave = 0;


    public static void print(String[] matrix) {
        for (String s : matrix) {
            System.out.println(s);
        }
    }

    public static int[] startPosition(String[] matrix) {
        int[] position = new int[2];
        for(int i=0; i<matrix.length; i++) {
            int start = matrix[i].indexOf(DEFAULT_START_MARK);
            if (start != -1) {
                position[0] = i;
                position[1] = start;
            }
        }
        return position;
    }

    public static int[] portkey(String[] matrix) {
        int[] start = startPosition(matrix);
        visited = new boolean[matrix.length][matrix[0].length()];
        dfs(matrix, visited, start[0], start[1], 0);

        return portkey;
    }

    private static boolean isMovable(String[] matrix, boolean[][] visited, int x, int y) {
        if (x < 0 || y < 0 || x >= matrix.length || y >= matrix[x].length() || visited[x][y])
            return false;

        char matter = matrix[x].charAt(y);
        if (matter == DEFAULT_ROAD_MARK || matter == DEFAULT_PORTKEY_MARK)
            return true;

        return false;
    }


    private static void dfs(String[] matrix, boolean[][] visited, int x, int y, int wave) {
        visited[x][y] = true;
        char matter = matrix[x].charAt(y);
        //System.out.println(x + " " + y + " = " + matter);
        if (matter == DEFAULT_PORTKEY_MARK) {
            //System.out.println("find portkey = " + wave);
            portkey[0] = x;
            portkey[1] = y;
            totWave = wave;
            return;
        }

        wave += isCrossRoad(matrix, x, y) ? 1 : 0;

        for (int[] dir : DIRECTIONS) {
            int dx = x + dir[0];
            int dy = y + dir[1];
            if (isMovable(matrix, visited, dx , dy)) {
                dfs(matrix, visited, dx, dy, wave);
            }
        }
    }

    private static boolean isCrossRoad(String[] matrix, int x, int y) {
        int wayCount = 0;
        for (int[] dir : DIRECTIONS) {
            int dx = x + dir[0];
            int dy = y + dir[1];
            //System.out.println("-> " + dx + " " + dy);
            if (isMovable(matrix, visited, dx , dy)) {
                //System.out.println(" --> " + dx + " " + dy);
                wayCount++;
                if (wayCount > 1)
                    return true;
            }
        }

        return false;
    }

    public static String countLuck(String[] matrix, int k) {
        int[] start = startPosition(matrix);
        visited = new boolean[matrix.length][matrix[0].length()];
        dfs(matrix, visited, start[0], start[1], 0);

        return totWave == k ? RON_RIGHT : RON_WRONG;
    }
}
