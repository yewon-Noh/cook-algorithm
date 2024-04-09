import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;

        // 각 행의 합, 열의 합을 구해 가장 큰 값을 answer에 저장
        int sum1, sum2;
        for (int i=0; i<n; i++) {
            sum1 = sum2 = 0;
            for (int j=0; j<n; j++) {
                sum1 += arr[i][j];  // 행의 합
                sum2 += arr[j][i];  // 열의 합
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        //  대각선의 합을 구해 큰 값을 answer에 저장
        sum1 = sum2 = 0;
        for (int i=0; i<n; i++) {
            sum1 += arr[i][i];      // 왼쪽 위 -> 오른쪽 아래 대각선의 합
            sum2 += arr[n-1-i][i];  // 왼쪽 아래 -> 오른쪽 위 대각선의 합
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}