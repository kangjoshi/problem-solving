package hackerRank;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 문제이해
 *  - 주어진 문자열은 s는 비밀번호이다. 비밀번호는 아래와 같은 조건을 만족해야한다.
 *  조건
 *   - 6자 이상
 *   - 숫자 + 소문자 + 대문자 + 특수문자 (최소한 1개의 문자씩)
 *
 *   - 주어진 문자열이 Strong password가 되려면 몇개의 문자가 필요한지
 *
 *   - s = "Ab1"
 *          -> 6자 이상?   3
 *          -> 숫자?      0
 *          -> 소문자?     0
 *          -> 대문자?     0
 *          -> 특수문자?    1
 *     s = #HackerRank
 *          -> 6자 이상?   0
 *          -> 숫자?      1
 *          -> 소문자?     0
 *          -> 대문자?     0
 *          -> 특수문자?    0
 *
 * 그려보기
 *  - 각각의 조건을 확인하고 만족여부를 리턴하는 함수 생성
 *  - 필요한 문자수 산출
 *
 */
public class StrongPassword {

    private static int MIN_LENGTH = 6;
    private static String SPECIAL_CHAR = "!@#$%^&*()-+";

    public static boolean checkLength(String password) {
        return password.length() >= MIN_LENGTH;
    }

    public static boolean checkHasNumber(String password) {
        for (char c : password.toCharArray())
            if (Character.isDigit(c)) return true;

        return false;
    }

    public static boolean checkHasLowerCase(String password) {
        for (char c : password.toCharArray())
            if (Character.isLowerCase(c)) return true;

        return false;
    }

    public static boolean checkHasUpperCase(String password) {
        for (char c : password.toCharArray())
            if (Character.isUpperCase(c)) return true;

        return false;
    }

    public static boolean checkHasSpecialChar(String password) {
        Pattern pattern = Pattern.compile("[!@#$%^&*()\\-+=]");
        Matcher matcher = pattern.matcher(password);
        return matcher.find();
    }

    public static int check(String password) {
        int length = 0;

        if (!checkLength(password)) {
            length = MIN_LENGTH - password.length();
        }

        int condition = 0;
        if (!checkHasNumber(password))
            condition++;

        if (!checkHasLowerCase(password))
            condition++;

        if (!checkHasUpperCase(password))
            condition++;

        if (!checkHasSpecialChar(password))
            condition++;

        return Math.max(length, condition);
    }
}
