package hackerRank;

/**
 * 문제이해
 *  - 주어진 문자열 s는 숫자로 이뤄져있다. 문자열이 아래 조건을 만족하는지 확인하는 함수를 작성하라.
 *  조건
 *    a[i] - a[i-1] = 1 <-- 숫자는 연속된 숫자여야한다.
 *    첫자리는 0이 될수 없다.
 *
 *    91011 -> {9, 10, 11} Yes 배열의 첫값
 *    101103 -> {101, 103} No
 *
 * 그려보기
 *  - 숫자를 나눈다.
 *    들어오는 문자열의 전반을 나누어 만들수 있는 모든 첫수를 만든다.
 *      첫 값은 문자열의 크기 / 2 이상일수 없으므로 / 2를 하여 구할수 있는 모든 첫 수를 만든다.
 *  - 만들어진 첫수의 배열과 나머지 문자열을 비교하며 조건을 만족하는지 확인한다.
 */
public class SeparateTheNumbers {

    public static long[] split(String s) {
        long[] numbers = new long[s.length()/2];
        for(int i=0; i<s.length()/2; i++) {
            numbers[i] = Long.parseLong(s.substring(0, i+1));
        }
        return numbers;
    }

    public static void beautiful(String s) {
        long[] split = split(s);

        for (long i : split) {
            boolean isBeautiful = true;
            long nextNumber = i+1;
            int start = getNumberFigure(i);
            int end = 0;
            while (start < s.length()) {
                end = (start + getNumberFigure(nextNumber));
                if (end > s.length()) {
                    end = s.length();
                }

                if (!String.valueOf(nextNumber).equals(s.substring(start, end))) {
                    isBeautiful = false;
                    break;
                }
                nextNumber++;
                start = end;
            }
            if (isBeautiful) {
                System.out.println("YES " + i);
                return;
            }
        }
        System.out.println("NO");
    }

    private static int getNumberFigure(long number) {
        if (number == 0) number = 1;
        return (int)(Math.log10(number)+1);
    }

}
