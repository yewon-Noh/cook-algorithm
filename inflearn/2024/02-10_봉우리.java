import java.util.Scanner;

public class Main {
    public int solution(int n, int[][] arr) {
        int answer = 0;
        for (int i=1; i<=n; i++) {
            for (int j=1; j<=n; j++) {
                if (arr[i][j] > arr[i-1][j])
                    if (arr[i][j] > arr[i+1][j])
                        if (arr[i][j] > arr[i][j-1])
                            if (arr[i][j] > arr[i][j+1]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i=1; i<=n; i++) {
            for (int j = 1; j<=n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}