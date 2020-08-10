import javax.sound.midi.Soundbank;
import java.util.PrimitiveIterator;

/**
 * 문제이해
 *  - 대탈출 보다가 나온 문제를 해결하는 알고리즘을 작성하자.
 *  - 다음 설명을 만족하느 세 자리 수를 구하시오
 *    1. 십의 자리 숫자는 0
 *    2. 백의 자리와 일의 자리 숫자를 바꾸면 처음 수 보다 198이 커진다.
 *    3. 백의 자리와 일의자리 숫자를 바꾼 수에 92를 더하면 일의 자리, 십의자리, 백의 자리 숫자가 같아진다.
 *
 * 그려보기
 *  - 십의 자리가 0인 숫자를 생성한다.
 *  - 2, 3번에 조건에 만족하는 숫자를 찾는다.
 *
 *  방정식을 이용해서 풀수 있을꺼 같은데...
 */
public class FindNumber {

    private static final int DEFAULT_GAP = 198;
    private static final int DEFAULT_ADD = 92;

    public static int find(int[] numbers) {
        for (int number : numbers) {
            int reverse = reverse(number);
            if (reverse - number == DEFAULT_GAP) {
                int sec = reverse + DEFAULT_ADD;
                if (oneNumber(sec)) {
                    return number;
                }
            }
        }
        return 0;
    }

    private static int reverse(int number) {
        int result = 0;
        while (number != 0) {
            result = result * 10 + number % 10;
            number /= 10;
        }
        return result;
    }

    public static boolean oneNumber(int number) {
        int digit = number % 10;
        while (number != 0) {
            if (digit != number % 10) return false;
            number /= 10;
        }
        return true;
    }
}
