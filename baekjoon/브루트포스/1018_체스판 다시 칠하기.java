import java.util.*;

public class Main {
    // 상단 좌측이 하얀색으로 시작하는 체스판
    private static final boolean[][] WHITE = {
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
    };
    // 상단 좌측이 검은색으로 시작하는 체스판
    private static final boolean[][] BLACK = {
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
            { false, true, false, true, false, true, false, true },
            { true, false, true, false, true, false, true, false },
    };
    private static boolean[][] board;

    public int solution(int N, int M) {
        int result = Integer.MAX_VALUE;

        // 총 8칸을 전달하므로 최댓값에서 7을 뺀다.
        for (int n = 0; n < N-7; n++) {
            for (int m = 0; m < M-7; m++) {
                int count = solve(n, m);
                result = Math.min(result, count);
            }
        }
        return result;
    }

    /**
     * 새로 덧칠할 칸의 개수를 반환한다.
     * @param x
     * @param y
     * @return
     */
    public int solve(int x, int y) {
        int white = 0, black = 0;

        for (int n=x; n<x+8; n++) {
            for (int m=y; m<y+8; m++) {
                if (board[n][m] != WHITE[n-x][m-y]) white++;  // 하얀색으로 시작할 경우
                if (board[n][m] != BLACK[n-x][m-y]) black++;  // 검정색으로 시작할 경우
            }
        }
        return Math.min(white, black);  // 둘 중 작은 수를 반환한다.
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in=new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        board = new boolean[N][M];

        for (int i=0; i<N; i++) {
            String str = in.next();
            for (int j=0; j<M; j++) {   // 하얀색은 true, 검은색은 false
                if (str.charAt(j) == 'W') board[i][j] = true;
                else board[i][j] = false;
            }
        }
        System.out.println(T.solution(N, M));
    }
}