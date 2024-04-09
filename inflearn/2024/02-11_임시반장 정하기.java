import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 1, num = 0;
        for (int i=1; i<=n; i++) {
            int cnt = 0;  // 한번이라도 같은 반인 학생의 수
            for (int j=1; j<=n; j++) {
                if (i == j) continue;
                for (int k=1; k<=5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        cnt++; break;
                    }
                }
            }
            if (num < cnt) {
                num = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+1][6];  // 0번은 사용 안함
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}