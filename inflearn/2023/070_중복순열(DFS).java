import java.util.*;

public class Main {
    static int n, m = 0;
    static int[] pm;

    public void DFS(int L) {
        if (L == m) {
            for (int x: pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                pm[L] = i;
                DFS(L+1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        m = in.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}
