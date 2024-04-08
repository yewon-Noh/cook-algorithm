import java.util.*;

public class Main {
    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {
        if (sum > m) return;
        if (L >= answer) return;             // 이미 answer보다 동전 개수가 많이 필요한 경우 reutrn
        if (sum == m) {
            answer = Math.min(answer, L);    // L은 동전 개수
        }
        else {
            for (int i=0; i<n; i++) {
                DFS(L+1, sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        Integer[] arr = new Integer[n];
        for (int i=0; i<n; i++) arr[i] = in.nextInt();
        Arrays.sort(arr, Collections.reverseOrder());    // 큰 금액부터 적용(내림차순)

        m = in.nextInt();
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}