package hackerRank;

/**
 * 문제이해
 *  - 문자열 s = "acxz"와 같이 주어질때 ascii코드의 배열로 변경 하였을때 [97, 99, 120, 122]
 *  - 뒤집은 문자열 zxca => [122, 120, 99, 97]
 *  - 기존 문자열의 각 배열의 차이는 [2, 21, 2] 뒤집은 문자열도 [2, 21, 2]이라면 funny이다.
 *  - 문자열이 funny라면 Funny 아니라며 Not Funny를 출력리턴하라.
 *
 * 그려보기
 *  - 문자열을 ascii 배열로 변경한다.
 *  - 뒤집은 문자열의 배열도 구한다.
 *    뒤집어서 다시 구하는것보다 배열을 뒤집는다?
 *    구해진 문자열 ascii 배열의 값을 대칭이 되는지 확인하는 방법도 있을듯?
 *      짝수, 홀수의 경우
 *      홀수
 *          [2, 21, 2]
 *
 *      짝수
 *          [2, 21, 21, 2]
 *
 */
public class FunnyString {

    public static int[] ascii(String s) {
        int[] asciiCodes = new int[s.length()];
        for (int i=0; i<s.length(); i++)
            asciiCodes[i] = (int) s.charAt(i);
        return asciiCodes;
    }

    public static int[] gap(int[] asciiCodes) {
        int[] gaps = new int[asciiCodes.length - 1];
        for (int i=0; i<asciiCodes.length-1; i++) {
            gaps[i] = Math.abs(asciiCodes[i] - asciiCodes[i+1]);
        }
        return gaps;
    }

    public static boolean symmetry(int[] array) {
        for (int i=0; i<array.length/2; i++) {
            if (array[i] != array[array.length-1-i]) {
                return false;
            }
        }
        return true;
    }

    public static String funny(String s) {
        boolean isFunny = symmetry(gap(ascii(s)));
        return isFunny ? "Funny" : "Not Funny";
    }
}
