import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public int[] solution(int n, Integer[] arr) {
        int[] answer = new int[n];
        // sorted 함수에 깊은 복사 후 정렬
        Integer[] sorted = Arrays.copyOf(arr, n);
        Arrays.sort(sorted, Collections.reverseOrder());

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (arr[i] == sorted[j]) {
                    answer[i] = j+1;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) arr[i] = sc.nextInt();
        for (int i: T.solution(n, arr)) System.out.print(i + " ");
    }
}