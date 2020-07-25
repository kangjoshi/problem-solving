package hackerRank;

/**
 * 문제이해
 *  - 주어진 문자열 s에서 단어의 수를 카운트하여 리턴
 *  - 카멜케이스로 구분되어 있음.
 *
 * 그려보기
 *  - 정규식을 이용하여 split후 카운트 한다?
 *
 */
public class CamelCase {

    public static int count(String s) {
        String regex = "(?=[A-Z])";
        return s.split(regex).length;
    }
}
