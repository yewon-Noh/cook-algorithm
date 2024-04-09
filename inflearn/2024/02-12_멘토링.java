import java.util.Scanner;

public class Main {
    public int solution(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                // 학생 i와 학생 j의 등수를 비교
                int cnt = 0;   // 학생 i가 j보다 등수가 높은 횟수
                for (int k=0; k<m; k++) {
                    // 학생 i와 j의 등수를 찾아 저장
                    int pi = 0, pj = 0;
                    for (int z=0; z<n; z++) {
                        if (arr[k][z] == i) pi = z;
                        if (arr[k][z] == j) pj = z;
                    }
                    // pi가 pj보다 등수가 높은 경우 cnt 증가
                    if (pi < pj) cnt++;
                }
                // 모든 경우(m)에서 pi가 pj보다 등수가 높은 경우(cnt) 멘토링 가능
                if (cnt == m) answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();    // 학생 수
        int m = sc.nextInt();    // 테스트 횟수
        int[][] arr = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, m, arr));
    }
}