package hackerRank;

import java.util.Stack;

/**
 * 문제이해
 *  - String s = "aaabccddd"와 같이 주어질때 인접한 문자가 쌍이면 지울수 있다
 *    aa abccddd <- aa 지워짐
 *    ab cc ddd <- cc 지워짐
 *    ab dd d  <- dd 지워짐
 *    = abd
 *    반환할 문자열이 없으면 "Empty String"을 반환한다.
 *
 *    aa ab cc dd d
 *
 *
 *
 * 그려보기
 *  - 순환을 하며 앞의 값과 뒤의 값을 비교
 *  - 비교하여 같으면 해당 문자열 삭제
 *
 *  변경
 *  - 스택을 사용하는 방법으로 변경
 *
 */
public class SuperReducedString {

    public static String reduce(String s) {
        StringBuilder sb = new StringBuilder();

        Stack<Character> characterStack = new Stack<>();

        for (int i=0; i<s.length(); i++) {
            if (!characterStack.isEmpty() && characterStack.peek() == s.charAt(i)){
                characterStack.pop();
                continue;
            }
            characterStack.push(s.charAt(i));
        }

        while (!characterStack.isEmpty()) sb.append(characterStack.pop());

        if (sb.length() == 0) return "Empty String";

        return sb.reverse().toString();
    }
}
