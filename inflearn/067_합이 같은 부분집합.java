import java.util.*;

public class Main {
    static String answer = "NO";
    static int n, total = 0;
    boolean flag = false;

    public void DFS(int L, int sum, int[] arr) {
        if (flag || (sum > total/2)) return;
        if (L == n) {
            if ((total-sum) == sum) {         // 두 부분집합의 합이 같은 경우
                answer = "YES";
                flag = true;
            }
        }
        else {
            DFS(L+1, sum+arr[L], arr);       // 부분집합에 포함
            DFS(L+1, sum, arr);              // 부분집합에 미포함
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = in.nextInt();
            total += arr[i];
        }
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}