import java.util.*;

// 부분집합 이용
public class Main {
    static int n, c = 0, answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return;                    // c가 넘게 태울 수 없음
        if (L == n) {
            answer = Math.max(answer, sum);     // 가장 무거운 무게 구함
        }
        else {
            DFS(L+1, sum+arr[L], arr);  // 부분집합에 포함
            DFS(L+1, sum, arr);              // 부분집합에 미포함
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        c = in.nextInt();
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}