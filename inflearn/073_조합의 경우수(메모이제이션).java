import java.util.*;

public class Main {
    // 이방식은 오래걸림
    public int DFS_(int n, int r) {
        if ((n == r) || (r == 0)) return 1;
        else return DFS_(n-1, r-1) + DFS_(n-1, r);
    }

    // 따라서 메모이제이션 사용!
    int[][] dy = new int[35][35];
    public int DFS(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if ((n == r) || (r == 0)) return 1;
        else return dy[n][r] = DFS(n-1, r-1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println(T.DFS(n, r));
    }
}
