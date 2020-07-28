package hackerRank;

/**
 * 문제이해
 *  - 거의 정렬된 int[] 배열이 주어질때 삽입정렬의 과정을 출력하라
 *      1 2 4 5 3, 3
 *
 *      1 2 4 5 5
 *      1 2 4 4 5
 *      1 2 3 4 5
 *
 * 그려보기
 *  - 삽입 정렬의 과정을 출력하자.
 *
 */
public class InsertionSortPartOne {

    public static void sort(int n, int[] arr) {
        /*
        int target = 0;
        for (int i=arr.length-1; i>0; i--) {
            if (arr[i] < arr[i-1])
                target = arr[i];
        }
        */

        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr.length; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }

            print(arr);
           /* if (isSwaped)
                print(arr);
            */
        }
    }

    private static void print(int[] arr) {
        for (int num : arr)
            System.out.print(num + " ");

        System.out.println();
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
