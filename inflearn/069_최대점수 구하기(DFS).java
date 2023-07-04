import java.util.*;

// 부분집합 이용
public class Main {
    static int n, m = 0, answer = Integer.MIN_VALUE;
    static int[] ps, pt;                                          // 점수, 시간

    public void DFS(int L, int score, int time) {
        if (time > m) return;
        if (L == n) {
            answer = Math.max(answer, score);
        }
        else {
            DFS(L+1, score+ps[L], time+pt[L]);                  // 부분집합에 포함
            DFS(L+1, score, time);                              // 부분집합에 미포함
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        ps = new int[n];
        pt = new int[n];
        for (int i=0; i<n; i++) {
            ps[i] = in.nextInt();
            pt[i] = in.nextInt();
        }
        T.DFS(0, 0, 0);
        System.out.println(answer);
    }
}
